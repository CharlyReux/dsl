/**
 */
package fr.ice.fsm.model.impl;

import fr.ice.fsm.model.ModelPackage;
import fr.ice.fsm.model.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.fsm.model.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.impl.StateImpl#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.impl.StateImpl#isInit <em>Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryName() <em>Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryName() <em>Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryName()
	 * @generated
	 * @ordered
	 */
	protected String entryName = ENTRY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryName() {
		return entryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryName(String newEntryName) {
		String oldEntryName = entryName;
		entryName = newEntryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STATE__ENTRY_NAME, oldEntryName,
					entryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STATE__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.STATE__NAME:
			return getName();
		case ModelPackage.STATE__ENTRY_NAME:
			return getEntryName();
		case ModelPackage.STATE__INIT:
			return isInit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.STATE__ENTRY_NAME:
			setEntryName((String) newValue);
			return;
		case ModelPackage.STATE__INIT:
			setInit((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.STATE__ENTRY_NAME:
			setEntryName(ENTRY_NAME_EDEFAULT);
			return;
		case ModelPackage.STATE__INIT:
			setInit(INIT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.STATE__ENTRY_NAME:
			return ENTRY_NAME_EDEFAULT == null ? entryName != null : !ENTRY_NAME_EDEFAULT.equals(entryName);
		case ModelPackage.STATE__INIT:
			return init != INIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", entryName: ");
		result.append(entryName);
		result.append(", init: ");
		result.append(init);
		result.append(')');
		return result.toString();
	}

} //StateImpl
