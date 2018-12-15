/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.impl;

import java.util.Collection;
import java.util.Map;

import net.sf.eclipsecorba.idl.IdlPackage;
import net.sf.eclipsecorba.idl.Specification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.SpecificationImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.SpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.SpecificationImpl#getMacros <em>Macros</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends DefinitionContainerImpl implements Specification {
	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList includes;

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
	 * The default value of the '{@link #getMacros() <em>Macros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacros()
	 * @generated
	 * @ordered
	 */
	protected static final Map MACROS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacros() <em>Macros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacros()
	 * @generated
	 * @ordered
	 */
	protected Map macros = MACROS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IdlPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncludes() {
		if (includes == null) {
			includes = new EObjectResolvingEList(Specification.class, this, IdlPackage.SPECIFICATION__INCLUDES);
		}
		return includes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getMacros() {
		return macros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacros(Map newMacros) {
		Map oldMacros = macros;
		macros = newMacros;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.SPECIFICATION__MACROS, oldMacros, macros));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdlPackage.SPECIFICATION__INCLUDES:
				return getIncludes();
			case IdlPackage.SPECIFICATION__NAME:
				return getName();
			case IdlPackage.SPECIFICATION__MACROS:
				return getMacros();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IdlPackage.SPECIFICATION__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection)newValue);
				return;
			case IdlPackage.SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case IdlPackage.SPECIFICATION__MACROS:
				setMacros((Map)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case IdlPackage.SPECIFICATION__INCLUDES:
				getIncludes().clear();
				return;
			case IdlPackage.SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IdlPackage.SPECIFICATION__MACROS:
				setMacros(MACROS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IdlPackage.SPECIFICATION__INCLUDES:
				return includes != null && !includes.isEmpty();
			case IdlPackage.SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IdlPackage.SPECIFICATION__MACROS:
				return MACROS_EDEFAULT == null ? macros != null : !MACROS_EDEFAULT.equals(macros);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", macros: ");
		result.append(macros);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
