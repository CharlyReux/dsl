/**
 * generated by Xtext 2.25.0
 */
package org.xtext.ice.formatting2;

import com.google.inject.Inject;
import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.State;
import fr.ice.fsm.model.Transition;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.ice.services.FsmGrammarAccess;

@SuppressWarnings("all")
public class FsmFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private FsmGrammarAccess _fsmGrammarAccess;
  
  protected void _format(final Fsm fsm, @Extension final IFormattableDocument document) {
    EList<State> _state = fsm.getState();
    for (final State state : _state) {
      document.<State>format(state);
    }
    EList<Transition> _transition = fsm.getTransition();
    for (final Transition transition : _transition) {
      document.<Transition>format(transition);
    }
  }
  
  public void format(final Object fsm, final IFormattableDocument document) {
    if (fsm instanceof XtextResource) {
      _format((XtextResource)fsm, document);
      return;
    } else if (fsm instanceof Fsm) {
      _format((Fsm)fsm, document);
      return;
    } else if (fsm instanceof EObject) {
      _format((EObject)fsm, document);
      return;
    } else if (fsm == null) {
      _format((Void)null, document);
      return;
    } else if (fsm != null) {
      _format(fsm, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fsm, document).toString());
    }
  }
}
