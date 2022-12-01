package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;
import java.util.Map;

@SuppressWarnings("all")
public class FSMAspectFsmAspectContext {
  public static final FSMAspectFsmAspectContext INSTANCE = new FSMAspectFsmAspectContext();
  
  public static FSMAspectFsmAspectProperties getSelf(final Fsm _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xtext.ice.generator.FSMAspectFsmAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Fsm, FSMAspectFsmAspectProperties> map = new java.util.WeakHashMap<fr.ice.fsm.model.Fsm, org.xtext.ice.generator.FSMAspectFsmAspectProperties>();
  
  public Map<Fsm, FSMAspectFsmAspectProperties> getMap() {
    return map;
  }
}
