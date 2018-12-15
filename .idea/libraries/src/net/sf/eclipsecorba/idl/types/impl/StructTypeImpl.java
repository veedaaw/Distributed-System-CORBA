/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types.impl;

import java.util.Collection;

import net.sf.eclipsecorba.idl.ForwardDcl;
import net.sf.eclipsecorba.idl.IdlPackage;
import net.sf.eclipsecorba.idl.Member;
import net.sf.eclipsecorba.idl.MemberContainer;

import net.sf.eclipsecorba.idl.impl.IdlTypeDclImpl;

import net.sf.eclipsecorba.idl.types.StructForwardDcl;
import net.sf.eclipsecorba.idl.types.StructType;
import net.sf.eclipsecorba.idl.types.TypesPackage;

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
 * An implementation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.types.impl.StructTypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.types.impl.StructTypeImpl#getForwardDeclaration <em>Forward Declaration</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.types.impl.StructTypeImpl#getForwardDcl <em>Forward Dcl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructTypeImpl extends IdlTypeDclImpl implements StructType {
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
	 * The cached value of the '{@link #getForwardDeclaration() <em>Forward Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardDeclaration()
	 * @generated
	 * @ordered
	 */
	protected ForwardDcl forwardDeclaration;

	/**
	 * The cached value of the '{@link #getForwardDcl() <em>Forward Dcl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardDcl()
	 * @generated
	 * @ordered
	 */
	protected StructForwardDcl forwardDcl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TypesPackage.Literals.STRUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList(Member.class, this, TypesPackage.STRUCT_TYPE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardDcl getForwardDeclaration() {
		return forwardDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForwardDeclaration(ForwardDcl newForwardDeclaration, NotificationChain msgs) {
		ForwardDcl oldForwardDeclaration = forwardDeclaration;
		forwardDeclaration = newForwardDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION, oldForwardDeclaration, newForwardDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardDeclaration(ForwardDcl newForwardDeclaration) {
		if (newForwardDeclaration != forwardDeclaration) {
			NotificationChain msgs = null;
			if (forwardDeclaration != null)
				msgs = ((InternalEObject)forwardDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION, null, msgs);
			if (newForwardDeclaration != null)
				msgs = ((InternalEObject)newForwardDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION, null, msgs);
			msgs = basicSetForwardDeclaration(newForwardDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION, newForwardDeclaration, newForwardDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructForwardDcl getForwardDcl() {
		if (forwardDcl != null && forwardDcl.eIsProxy()) {
			InternalEObject oldForwardDcl = (InternalEObject)forwardDcl;
			forwardDcl = (StructForwardDcl)eResolveProxy(oldForwardDcl);
			if (forwardDcl != oldForwardDcl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.STRUCT_TYPE__FORWARD_DCL, oldForwardDcl, forwardDcl));
			}
		}
		return forwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructForwardDcl basicGetForwardDcl() {
		return forwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForwardDcl(StructForwardDcl newForwardDcl, NotificationChain msgs) {
		StructForwardDcl oldForwardDcl = forwardDcl;
		forwardDcl = newForwardDcl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCT_TYPE__FORWARD_DCL, oldForwardDcl, newForwardDcl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardDcl(StructForwardDcl newForwardDcl) {
		if (newForwardDcl != forwardDcl) {
			NotificationChain msgs = null;
			if (forwardDcl != null)
				msgs = ((InternalEObject)forwardDcl).eInverseRemove(this, TypesPackage.STRUCT_FORWARD_DCL__IMPLEMENTATION, StructForwardDcl.class, msgs);
			if (newForwardDcl != null)
				msgs = ((InternalEObject)newForwardDcl).eInverseAdd(this, TypesPackage.STRUCT_FORWARD_DCL__IMPLEMENTATION, StructForwardDcl.class, msgs);
			msgs = basicSetForwardDcl(newForwardDcl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCT_TYPE__FORWARD_DCL, newForwardDcl, newForwardDcl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCT_TYPE__FORWARD_DCL:
				if (forwardDcl != null)
					msgs = ((InternalEObject)forwardDcl).eInverseRemove(this, TypesPackage.STRUCT_FORWARD_DCL__IMPLEMENTATION, StructForwardDcl.class, msgs);
				return basicSetForwardDcl((StructForwardDcl)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCT_TYPE__MEMBERS:
				return ((InternalEList)getMembers()).basicRemove(otherEnd, msgs);
			case TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION:
				return basicSetForwardDeclaration(null, msgs);
			case TypesPackage.STRUCT_TYPE__FORWARD_DCL:
				return basicSetForwardDcl(null, msgs);
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
			case TypesPackage.STRUCT_TYPE__MEMBERS:
				return getMembers();
			case TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION:
				return getForwardDeclaration();
			case TypesPackage.STRUCT_TYPE__FORWARD_DCL:
				if (resolve) return getForwardDcl();
				return basicGetForwardDcl();
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
			case TypesPackage.STRUCT_TYPE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection)newValue);
				return;
			case TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION:
				setForwardDeclaration((ForwardDcl)newValue);
				return;
			case TypesPackage.STRUCT_TYPE__FORWARD_DCL:
				setForwardDcl((StructForwardDcl)newValue);
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
			case TypesPackage.STRUCT_TYPE__MEMBERS:
				getMembers().clear();
				return;
			case TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION:
				setForwardDeclaration((ForwardDcl)null);
				return;
			case TypesPackage.STRUCT_TYPE__FORWARD_DCL:
				setForwardDcl((StructForwardDcl)null);
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
			case TypesPackage.STRUCT_TYPE__MEMBERS:
				return members != null && !members.isEmpty();
			case TypesPackage.STRUCT_TYPE__FORWARD_DECLARATION:
				return forwardDeclaration != null;
			case TypesPackage.STRUCT_TYPE__FORWARD_DCL:
				return forwardDcl != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == MemberContainer.class) {
			switch (derivedFeatureID) {
				case TypesPackage.STRUCT_TYPE__MEMBERS: return IdlPackage.MEMBER_CONTAINER__MEMBERS;
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
		if (baseClass == MemberContainer.class) {
			switch (baseFeatureID) {
				case IdlPackage.MEMBER_CONTAINER__MEMBERS: return TypesPackage.STRUCT_TYPE__MEMBERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StructTypeImpl
