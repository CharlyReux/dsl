package org.xtext.ice.generator;

import fr.ice.fsm.model.State;
import java.util.Map;

@SuppressWarnings("all")
public class StateAspectStateAspectContext {
  public static final StateAspectStateAspectContext INSTANCE = new StateAspectStateAspectContext();
  
  public static StateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xtext.ice.generator.StateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State, StateAspectStateAspectProperties> map = new java.util.WeakHashMap<fr.ice.fsm.model.State, org.xtext.ice.generator.StateAspectStateAspectProperties>();
  
  public Map<State, StateAspectStateAspectProperties> getMap() {
    return map;
  }
}
