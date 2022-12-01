package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;

@SuppressWarnings("all")
public abstract class FSMCompiler {
  public abstract CharSequence compile(final Fsm fsm);
}
