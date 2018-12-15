/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types.impl;

import java.util.Collection;

import net.sf.eclipsecorba.idl.impl.IdlTypeDclImpl;

import net.sf.eclipsecorba.idl.types.EnumType;
import net.sf.eclipsecorba.idl.types.TypesPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.types.impl.EnumTypeImpl#getEnumerators <em>Enumerators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumTypeImpl extends IdlTypeDclImpl implements EnumType {
	/**
	 * The cached value of the '{@link #getEnumerators() <em>Enumerators</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerators()
	 * @generated
	 * @ordered
	 */
	protected EList enumerators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnumerators() {
		if (enumerators == null) {
			enumerators = new EDataTypeUniqueEList(String.class, this, TypesPackage.ENUM_TYPE__ENUMERATORS);
		}
		return enumerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ENUM_TYPE__ENUMERATORS:
				return getEnumerators();
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
			case TypesPackage.ENUM_TYPE__ENUMERATORS:
				getEnumerators().clear();
				getEnumerators().addAll((Collection)newValue);
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
			case TypesPackage.ENUM_TYPE__ENUMERATORS:
				getEnumerators().clear();
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
			case TypesPackage.ENUM_TYPE__ENUMERATORS:
				return enumerators != null && !enumerators.isEmpty();
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
		result.append(" (enumerators: ");
		result.append(enumerators);
		result.append(')');
		return result.toString();
	}

} //EnumTypeImpl
