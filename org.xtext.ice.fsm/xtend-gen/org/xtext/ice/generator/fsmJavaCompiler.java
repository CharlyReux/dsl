package org.xtext.ice.generator;

import com.google.common.base.Objects;
import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.State;
import fr.ice.fsm.model.Transition;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class fsmJavaCompiler extends FSMCompiler {
  /**
   * Visitor function for the fsm
   * @param fsm The fsm to visit
   */
  @Override
  public CharSequence compile(final Fsm fsm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    CharSequence _createContext = this.createContext(fsm);
    _builder.append(_createContext);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("//State interface class");
    _builder.newLine();
    _builder.append("interface State{");
    _builder.newLine();
    {
      EList<Transition> _transition = fsm.getTransition();
      for(final Transition transition : _transition) {
        _builder.append("\t");
        _builder.append("public void ");
        String _name = transition.getName();
        _builder.append(_name, "\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Concrete classes");
    _builder.newLine();
    {
      EList<State> _state = fsm.getState();
      for(final State state : _state) {
        CharSequence _compile = this.compile(state, fsm.getTransition());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    CharSequence _createMain = this.createMain(fsm);
    _builder.append(_createMain);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Visitor function for the state
   * @param state The state to visit
   * @param transitions The list of transitions
   */
  public CharSequence compile(final State state, final EList<Transition> transitions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = state.getName();
    _builder.append(_name);
    _builder.append(" implements State{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Context context;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = state.getName();
    _builder.append(_name_1, "\t");
    _builder.append("(Context context){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.context = context;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Transition transition : transitions) {
        _builder.append("\t");
        CharSequence _compile = this.compile(transition, state);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Visitor function for the transitions
   * @param transition The transition to visit
   * @param currentState The current state that is needed to create adequate methods in the state that is being built
   */
  public CharSequence compile(final Transition transition, final State currentState) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void ");
    String _name = transition.getName();
    _builder.append(_name);
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    {
      String _name_1 = transition.getSource().getName();
      String _name_2 = currentState.getName();
      boolean _equals = Objects.equal(_name_1, _name_2);
      if (_equals) {
        _builder.append("\t");
        _builder.append("context.changeState(new ");
        String _name_3 = transition.getDestination().getName();
        _builder.append(_name_3, "\t");
        _builder.append("(this.context));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("System.out.println(\"");
        String _entryName = transition.getDestination().getEntryName();
        _builder.append(_entryName, "\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Creates the main method
   * @param fsm the fsm to build uppon
   */
  public CharSequence createMain(final Fsm fsm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//main class");
    _builder.newLine();
    _builder.append("public class main{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("Context myContext = new Context();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while(true){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(\"Enter Transition: \");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Scanner scanner = new Scanner(System.in);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("String transition = scanner.nextLine();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("makeTransition(transition,myContext);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void makeTransition(String transition, Context context){");
    _builder.newLine();
    _builder.append("\t\t  \t");
    _builder.append("switch(transition){");
    _builder.newLine();
    _builder.append("\t\t  \t\t");
    final LinkedHashMap<String, ArrayList<String>> myMap = CollectionLiterals.<String, ArrayList<String>>newLinkedHashMap();
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t  \t\t");
    EList<Transition> _transition = fsm.getTransition();
    for (final Transition transition : _transition) {
      boolean _containsKey = myMap.containsKey(transition.getTrigger());
      boolean _not = (!_containsKey);
      if (_not) {
        myMap.put(transition.getTrigger(), CollectionLiterals.<String>newArrayList(transition.getName()));
      } else {
        myMap.get(transition.getTrigger()).add(transition.getName());
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Set<Map.Entry<String, ArrayList<String>>> _entrySet = myMap.entrySet();
      for(final Map.Entry<String, ArrayList<String>> keyObj : _entrySet) {
        _builder.append("\t\t\t");
        _builder.append("case \"");
        String _key = keyObj.getKey();
        _builder.append(_key, "\t\t\t");
        _builder.append("\":");
        _builder.newLineIfNotEmpty();
        {
          ArrayList<String> _value = keyObj.getValue();
          for(final String objs : _value) {
            _builder.append("\t\t\t");
            _builder.append(" \t\t\t");
            _builder.append("context.");
            _builder.append(objs, "\t\t\t \t\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("break;");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Creates the context of the state machine
   * @param fsm the Fsm to build uppon
   */
  public CharSequence createContext(final Fsm fsm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Context class");
    _builder.newLine();
    _builder.append("class Context{");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("State state;");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("public Context(){");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("this.state = new ");
    {
      EList<State> _state = fsm.getState();
      for(final State state : _state) {
        {
          boolean _isInit = state.isInit();
          if (_isInit) {
            String _name = state.getName();
            _builder.append(_name, "\t ");
          }
        }
      }
    }
    _builder.append("(this);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("public void changeState(State state){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.state = state;");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("}");
    _builder.newLine();
    {
      EList<Transition> _transition = fsm.getTransition();
      for(final Transition transition : _transition) {
        _builder.append("\t ");
        _builder.append("public void ");
        String _name_1 = transition.getName();
        _builder.append(_name_1, "\t ");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t ");
        _builder.append("\t");
        _builder.append("this.state.");
        String _name_2 = transition.getName();
        _builder.append(_name_2, "\t \t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
