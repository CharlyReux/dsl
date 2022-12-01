/**
 */
package fr.ice.fsm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.fsm.model.Fsm#getState <em>State</em>}</li>
 *   <li>{@link fr.ice.fsm.model.Fsm#getTransition <em>Transition</em>}</li>
 *   <li>{@link fr.ice.fsm.model.Fsm#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.ice.fsm.model.ModelPackage#getFsm()
 * @model
 * @generated
 */
public interface Fsm extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ice.fsm.model.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see fr.ice.fsm.model.ModelPackage#getFsm_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ice.fsm.model.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see fr.ice.fsm.model.ModelPackage#getFsm_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ice.fsm.model.ModelPackage#getFsm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.Fsm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Fsm
