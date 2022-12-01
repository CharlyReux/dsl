package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;

@SuppressWarnings("all")
public abstract class FSMInterpreter implements FSMvisitor {
  public abstract void interpret(final Fsm myFsm);
}
