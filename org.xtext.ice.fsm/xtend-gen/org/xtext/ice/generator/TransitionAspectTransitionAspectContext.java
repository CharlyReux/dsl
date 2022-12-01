package org.xtext.ice.generator;

import fr.ice.fsm.model.Transition;
import java.util.Map;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public static final TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xtext.ice.generator.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<fr.ice.fsm.model.Transition, org.xtext.ice.generator.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
