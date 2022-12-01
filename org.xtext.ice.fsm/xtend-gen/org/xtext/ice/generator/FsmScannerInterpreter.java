package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.State;
import java.util.Scanner;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class FsmScannerInterpreter extends FSMInterpreter {
  @Override
  public void interpret(final Fsm myFsm) {
    final Consumer<State> _function = (State st) -> {
      boolean _isInit = st.isInit();
      if (_isInit) {
        FSMAspect.currentState(myFsm, st);
      }
    };
    myFsm.getState().forEach(_function);
    final Scanner sc = new Scanner(System.in);
    while (true) {
      {
        final String trigger = sc.nextLine();
        StateAspect.step(FSMAspect.currentState(myFsm), trigger, myFsm);
      }
    }
  }
}
