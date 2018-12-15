/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.impl;

import java.util.Collection;

import net.sf.eclipsecorba.idl.Export;
import net.sf.eclipsecorba.idl.IdlException;
import net.sf.eclipsecorba.idl.IdlPackage;
import net.sf.eclipsecorba.idl.IdlType;
import net.sf.eclipsecorba.idl.Member;
import net.sf.eclipsecorba.idl.MemberContainer;
import net.sf.eclipsecorba.idl.Typed;
import net.sf.eclipsecorba.idl.TypedElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.IdlExceptionImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.IdlExceptionImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdlExceptionImpl extends DefinitionImpl implements IdlException {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IdlType type;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdlExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IdlPackage.Literals.IDL_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (IdlType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlPackage.IDL_EXCEPTION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IdlType newType) {
		IdlType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.IDL_EXCEPTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList(Member.class, this, IdlPackage.IDL_EXCEPTION__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlPackage.IDL_EXCEPTION__MEMBERS:
				return ((InternalEList)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdlPackage.IDL_EXCEPTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case IdlPackage.IDL_EXCEPTION__MEMBERS:
				return getMembers();
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
			case IdlPackage.IDL_EXCEPTION__TYPE:
				setType((IdlType)newValue);
				return;
			case IdlPackage.IDL_EXCEPTION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection)newValue);
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
			case IdlPackage.IDL_EXCEPTION__TYPE:
				setType((IdlType)null);
				return;
			case IdlPackage.IDL_EXCEPTION__MEMBERS:
				getMembers().clear();
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
			case IdlPackage.IDL_EXCEPTION__TYPE:
				return type != null;
			case IdlPackage.IDL_EXCEPTION__MEMBERS:
				return members != null && !members.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Typed.class) {
			switch (derivedFeatureID) {
				case IdlPackage.IDL_EXCEPTION__TYPE: return IdlPackage.TYPED__TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Export.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MemberContainer.class) {
			switch (derivedFeatureID) {
				case IdlPackage.IDL_EXCEPTION__MEMBERS: return IdlPackage.MEMBER_CONTAINER__MEMBERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Typed.class) {
			switch (baseFeatureID) {
				case IdlPackage.TYPED__TYPE: return IdlPackage.IDL_EXCEPTION__TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Export.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MemberContainer.class) {
			switch (baseFeatureID) {
				case IdlPackage.MEMBER_CONTAINER__MEMBERS: return IdlPackage.IDL_EXCEPTION__MEMBERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IdlExceptionImpl
