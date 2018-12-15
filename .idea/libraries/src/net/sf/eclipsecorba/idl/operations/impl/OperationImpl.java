/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.operations.impl;

import java.util.Collection;

import net.sf.eclipsecorba.idl.Commentable;
import net.sf.eclipsecorba.idl.IdlException;
import net.sf.eclipsecorba.idl.IdlPackage;

import net.sf.eclipsecorba.idl.impl.ExportImpl;

import net.sf.eclipsecorba.idl.operations.Operation;
import net.sf.eclipsecorba.idl.operations.OperationsPackage;
import net.sf.eclipsecorba.idl.operations.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.impl.OperationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.impl.OperationImpl#isOneway <em>Oneway</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.impl.OperationImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.impl.OperationImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends ExportImpl implements Operation {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOneway() <em>Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneway()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONEWAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOneway() <em>Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneway()
	 * @generated
	 * @ordered
	 */
	protected boolean oneway = ONEWAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList exceptions;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.OPERATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOneway() {
		return oneway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneway(boolean newOneway) {
		boolean oldOneway = oneway;
		oneway = newOneway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.OPERATION__ONEWAY, oldOneway, oneway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList(Parameter.class, this, OperationsPackage.OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectResolvingEList(IdlException.class, this, OperationsPackage.OPERATION__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContext() {
		if (context == null) {
			context = new EDataTypeUniqueEList(String.class, this, OperationsPackage.OPERATION__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationsPackage.OPERATION__PARAMETERS:
				return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
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
			case OperationsPackage.OPERATION__COMMENT:
				return getComment();
			case OperationsPackage.OPERATION__ONEWAY:
				return isOneway() ? Boolean.TRUE : Boolean.FALSE;
			case OperationsPackage.OPERATION__PARAMETERS:
				return getParameters();
			case OperationsPackage.OPERATION__EXCEPTIONS:
				return getExceptions();
			case OperationsPackage.OPERATION__CONTEXT:
				return getContext();
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
			case OperationsPackage.OPERATION__COMMENT:
				setComment((String)newValue);
				return;
			case OperationsPackage.OPERATION__ONEWAY:
				setOneway(((Boolean)newValue).booleanValue());
				return;
			case OperationsPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case OperationsPackage.OPERATION__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection)newValue);
				return;
			case OperationsPackage.OPERATION__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection)newValue);
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
			case OperationsPackage.OPERATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case OperationsPackage.OPERATION__ONEWAY:
				setOneway(ONEWAY_EDEFAULT);
				return;
			case OperationsPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case OperationsPackage.OPERATION__EXCEPTIONS:
				getExceptions().clear();
				return;
			case OperationsPackage.OPERATION__CONTEXT:
				getContext().clear();
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
			case OperationsPackage.OPERATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case OperationsPackage.OPERATION__ONEWAY:
				return oneway != ONEWAY_EDEFAULT;
			case OperationsPackage.OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case OperationsPackage.OPERATION__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
			case OperationsPackage.OPERATION__CONTEXT:
				return context != null && !context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				case OperationsPackage.OPERATION__COMMENT: return IdlPackage.COMMENTABLE__COMMENT;
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
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				case IdlPackage.COMMENTABLE__COMMENT: return OperationsPackage.OPERATION__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(", oneway: ");
		result.append(oneway);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
