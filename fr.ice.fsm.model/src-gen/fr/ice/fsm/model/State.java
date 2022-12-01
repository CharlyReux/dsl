/**
 */
package fr.ice.fsm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.fsm.model.State#getName <em>Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.State#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.State#isInit <em>Init</em>}</li>
 * </ul>
 *
 * @see fr.ice.fsm.model.ModelPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ice.fsm.model.ModelPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Name</em>' attribute.
	 * @see #setEntryName(String)
	 * @see fr.ice.fsm.model.ModelPackage#getState_EntryName()
	 * @model
	 * @generated
	 */
	String getEntryName();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.State#getEntryName <em>Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Name</em>' attribute.
	 * @see #getEntryName()
	 * @generated
	 */
	void setEntryName(String value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see fr.ice.fsm.model.ModelPackage#getState_Init()
	 * @model
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.State#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

} // State
