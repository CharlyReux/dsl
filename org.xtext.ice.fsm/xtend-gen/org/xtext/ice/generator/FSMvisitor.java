package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;

@SuppressWarnings("all")
public interface FSMvisitor {
  CharSequence compile(final Fsm fsm);
}
