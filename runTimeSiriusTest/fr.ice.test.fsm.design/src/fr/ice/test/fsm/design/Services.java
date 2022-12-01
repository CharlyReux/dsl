package fr.ice.test.fsm.design;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.State;
import fr.ice.fsm.model.Transition;
	
/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public List<State> getTransitions(State state) {
       Fsm parentFsm = (Fsm) state.eContainer();
       List<State> myDestinations =  new LinkedList<State>();
     EList<Transition> myTransitions =  parentFsm.getTransition();
     for (Transition transition : myTransitions) {
		if(transition.getSource()==state) {
			myDestinations.add(transition.getDestination());
		}
	}
     return myDestinations;
    }
    
    public Fsm getFsm(State state) {
        Fsm parentFsm = (Fsm) state.eContainer();
        return parentFsm;
    }
}
