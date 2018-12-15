/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types.impl;

import net.sf.eclipsecorba.idl.impl.IdlTypeDclImpl;

import net.sf.eclipsecorba.idl.types.TypesPackage;
import net.sf.eclipsecorba.idl.types.UnionForwardDcl;
import net.sf.eclipsecorba.idl.types.UnionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.types.impl.UnionTypeImpl#getForwardDcl <em>Forward Dcl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionTypeImpl extends IdlTypeDclImpl implements UnionType {
	/**
	 * The cached value of the '{@link #getForwardDcl() <em>Forward Dcl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardDcl()
	 * @generated
	 * @ordered
	 */
	protected UnionForwardDcl forwardDcl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TypesPackage.Literals.UNION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionForwardDcl getForwardDcl() {
		if (forwardDcl != null && forwardDcl.eIsProxy()) {
			InternalEObject oldForwardDcl = (InternalEObject)forwardDcl;
			forwardDcl = (UnionForwardDcl)eResolveProxy(oldForwardDcl);
			if (forwardDcl != oldForwardDcl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.UNION_TYPE__FORWARD_DCL, oldForwardDcl, forwardDcl));
			}
		}
		return forwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionForwardDcl basicGetForwardDcl() {
		return forwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForwardDcl(UnionForwardDcl newForwardDcl, NotificationChain msgs) {
		UnionForwardDcl oldForwardDcl = forwardDcl;
		forwardDcl = newForwardDcl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UNION_TYPE__FORWARD_DCL, oldForwardDcl, newForwardDcl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardDcl(UnionForwardDcl newForwardDcl) {
		if (newForwardDcl != forwardDcl) {
			NotificationChain msgs = null;
			if (forwardDcl != null)
				msgs = ((InternalEObject)forwardDcl).eInverseRemove(this, TypesPackage.UNION_FORWARD_DCL__IMPLEMENTATION, UnionForwardDcl.class, msgs);
			if (newForwardDcl != null)
				msgs = ((InternalEObject)newForwardDcl).eInverseAdd(this, TypesPackage.UNION_FORWARD_DCL__IMPLEMENTATION, UnionForwardDcl.class, msgs);
			msgs = basicSetForwardDcl(newForwardDcl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UNION_TYPE__FORWARD_DCL, newForwardDcl, newForwardDcl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.UNION_TYPE__FORWARD_DCL:
				if (forwardDcl != null)
					msgs = ((InternalEObject)forwardDcl).eInverseRemove(this, TypesPackage.UNION_FORWARD_DCL__IMPLEMENTATION, UnionForwardDcl.class, msgs);
				return basicSetForwardDcl((UnionForwardDcl)otherEnd, msgs);
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
			case TypesPackage.UNION_TYPE__FORWARD_DCL:
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
			case TypesPackage.UNION_TYPE__FORWARD_DCL:
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
			case TypesPackage.UNION_TYPE__FORWARD_DCL:
				setForwardDcl((UnionForwardDcl)newValue);
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
			case TypesPackage.UNION_TYPE__FORWARD_DCL:
				setForwardDcl((UnionForwardDcl)null);
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
			case TypesPackage.UNION_TYPE__FORWARD_DCL:
				return forwardDcl != null;
		}
		return super.eIsSet(featureID);
	}

} //UnionTypeImpl
