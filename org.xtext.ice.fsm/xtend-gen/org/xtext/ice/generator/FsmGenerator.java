/**
 * generated by Xtext 2.25.0
 */
package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;
import java.util.Scanner;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class FsmGenerator extends AbstractGenerator {
  private FSMCompiler myCompiler;
  
  private FSMInterpreter myInterpreter;
  
  private String action = "";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    final Fsm myFsm = ((Fsm) _get);
    fsmJavaCompiler _fsmJavaCompiler = new fsmJavaCompiler();
    this.myCompiler = _fsmJavaCompiler;
    FsmScannerInterpreter _fsmScannerInterpreter = new FsmScannerInterpreter();
    this.myInterpreter = _fsmScannerInterpreter;
    final Scanner mainScanner = new Scanner(System.in);
    final String action = this.action;
    if (action != null) {
      switch (action) {
        case "compile":
          fsa.generateFile("main.java", this.myCompiler.compile(myFsm));
          break;
        case "interpret":
          this.myInterpreter.interpret(myFsm);
          break;
        case "":
          this.action = mainScanner.nextLine();
          break;
        default:
          InputOutput.<String>print("action not recognized: use either \"interpret\" or \"compile\"");
          break;
      }
    } else {
      InputOutput.<String>print("action not recognized: use either \"interpret\" or \"compile\"");
    }
  }
}
