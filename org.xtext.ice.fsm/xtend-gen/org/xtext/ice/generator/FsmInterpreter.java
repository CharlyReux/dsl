package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.State;
import java.util.Scanner;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class FsmInterpreter {
  public void interpret(final Fsm myFsm) {
    final Scanner sc = new Scanner(System.in);
    while (true) {
      {
        final String trigger = sc.nextLine();
        InputOutput.<String>print(trigger);
        final Consumer<State> _function = (State st) -> {
          StateAspect.step(st, trigger, myFsm);
        };
        myFsm.getState().forEach(_function);
      }
    }
  }
}
