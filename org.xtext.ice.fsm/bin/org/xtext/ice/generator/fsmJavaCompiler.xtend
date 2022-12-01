package org.xtext.ice.generator

import fr.ice.fsm.model.Fsm
import fr.ice.fsm.model.State
import fr.ice.fsm.model.Transition
import org.eclipse.emf.common.util.EList

class fsmJavaCompiler extends FSMCompiler {
 
	/**
	 * Visitor function for the fsm
	 * @param fsm The fsm to visit
	 */
	override compile(Fsm fsm) '''
import java.util.*;
	
«fsm.createContext()»

//State interface class
interface State{
	«FOR transition : fsm.transition»
	public void «transition.name»();
	«ENDFOR»
}

//Concrete classes
«FOR state : fsm.state»
	«state.compile(fsm.transition)»
«ENDFOR»

«fsm.createMain()»

'''

	/**
	 * Visitor function for the state
	 * @param state The state to visit
	 * @param transitions The list of transitions
	 */
	def compile(State state, EList<Transition> transitions) '''
		class «state.name» implements State{
			Context context;
			
			public «state.name»(Context context){
				this.context = context;
			}
		
			«FOR transition : transitions»
				«transition.compile(state)»
			«ENDFOR»
		}
		
		
	'''

	/**
	 * Visitor function for the transitions
	 * @param transition The transition to visit
	 * @param currentState The current state that is needed to create adequate methods in the state that is being built
	 */
	def compile(Transition transition, State currentState) '''
		public void «transition.name»(){
			«IF transition.source.name == currentState.name»
				context.changeState(new «transition.destination.name»(this.context));
				System.out.println("«transition.destination.entryName»");
			«ENDIF»
		}
	'''

	/**
	 * Creates the main method
	 * @param fsm the fsm to build uppon
	 */
	def createMain(Fsm fsm) '''
		
		//main class
		public class main{
		    public static void main(String[] args) {
		    	Context myContext = new Context();
				while(true){
					System.out.println("Enter Transition: ");
					Scanner scanner = new Scanner(System.in);
					String transition = scanner.nextLine();
					makeTransition(transition,myContext);
				}
			}
			public static void makeTransition(String transition, Context context){
				  	switch(transition){
				  		«val myMap = newLinkedHashMap()»
				  		«for( transition : fsm.transition){
	 			
	 			if(!myMap.containsKey(transition.trigger)){
	 				myMap.put(transition.trigger,newArrayList(transition.name))
	 			}else{
	 				myMap.get(transition.trigger).add(transition.name)
	 			}
				
				}»
					«FOR keyObj : myMap.entrySet»
						case "«keyObj.key»":
						 			«FOR objs : keyObj.value»
						 				context.«objs»();
						 			«ENDFOR»
						break;
					«ENDFOR»
					}
				}
			}
	'''

	/**
	 * Creates the context of the state machine
	 * @param fsm the Fsm to build uppon
	 */
	def createContext(Fsm fsm) '''
		//Context class
		class Context{
			 State state;
			 public Context(){
			 this.state = new «FOR state : fsm.state»«IF state.init»«state.name»«ENDIF»«ENDFOR»(this);
			 }
			 public void changeState(State state){
			this.state = state;
			 }
			 «FOR transition : fsm.transition»
			 	public void «transition.name»(){
			 		this.state.«transition.name»();
			 	}
			 «ENDFOR»
		}
	'''

}
