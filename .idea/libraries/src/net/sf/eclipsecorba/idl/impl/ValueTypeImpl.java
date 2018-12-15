/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.impl;

import java.util.Collection;

import net.sf.eclipsecorba.idl.Commentable;
import net.sf.eclipsecorba.idl.Definition;
import net.sf.eclipsecorba.idl.DefinitionContainer;
import net.sf.eclipsecorba.idl.Element;
import net.sf.eclipsecorba.idl.Export;
import net.sf.eclipsecorba.idl.ExportContainer;
import net.sf.eclipsecorba.idl.FileRegion;
import net.sf.eclipsecorba.idl.ForwardDcl;
import net.sf.eclipsecorba.idl.Identifiable;
import net.sf.eclipsecorba.idl.IdlInterfaceDcl;
import net.sf.eclipsecorba.idl.IdlPackage;
import net.sf.eclipsecorba.idl.IdlType;
import net.sf.eclipsecorba.idl.IdlTypeDcl;
import net.sf.eclipsecorba.idl.Typed;
import net.sf.eclipsecorba.idl.TypedElement;
import net.sf.eclipsecorba.idl.ValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getInheritedInterfaces <em>Inherited Interfaces</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#isLocal <em>Local</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl#getForwardDcl <em>Forward Dcl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueTypeImpl extends MemberContainerImpl implements ValueType {
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
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected int pos = POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IdlType type;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList definitions;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList body;

	/**
	 * The cached value of the '{@link #getInheritedInterfaces() <em>Inherited Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList inheritedInterfaces;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean local = LOCAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForwardDcl() <em>Forward Dcl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardDcl()
	 * @generated
	 * @ordered
	 */
	protected ForwardDcl forwardDcl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IdlPackage.Literals.VALUE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(int newPos) {
		int oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__COMMENT, oldComment, comment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlPackage.VALUE_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList(Definition.class, this, IdlPackage.VALUE_TYPE__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBody() {
		if (body == null) {
			body = new EObjectContainmentEList(Export.class, this, IdlPackage.VALUE_TYPE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInheritedInterfaces() {
		if (inheritedInterfaces == null) {
			inheritedInterfaces = new EObjectResolvingEList(IdlInterfaceDcl.class, this, IdlPackage.VALUE_TYPE__INHERITED_INTERFACES);
		}
		return inheritedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(boolean newLocal) {
		boolean oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__LOCAL, oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardDcl getForwardDcl() {
		if (forwardDcl != null && forwardDcl.eIsProxy()) {
			InternalEObject oldForwardDcl = (InternalEObject)forwardDcl;
			forwardDcl = (ForwardDcl)eResolveProxy(oldForwardDcl);
			if (forwardDcl != oldForwardDcl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlPackage.VALUE_TYPE__FORWARD_DCL, oldForwardDcl, forwardDcl));
			}
		}
		return forwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardDcl basicGetForwardDcl() {
		return forwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardDcl(ForwardDcl newForwardDcl) {
		ForwardDcl oldForwardDcl = forwardDcl;
		forwardDcl = newForwardDcl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.VALUE_TYPE__FORWARD_DCL, oldForwardDcl, forwardDcl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlPackage.VALUE_TYPE__DEFINITIONS:
				return ((InternalEList)getDefinitions()).basicRemove(otherEnd, msgs);
			case IdlPackage.VALUE_TYPE__BODY:
				return ((InternalEList)getBody()).basicRemove(otherEnd, msgs);
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
			case IdlPackage.VALUE_TYPE__NAME:
				return getName();
			case IdlPackage.VALUE_TYPE__LINE:
				return new Integer(getLine());
			case IdlPackage.VALUE_TYPE__POS:
				return new Integer(getPos());
			case IdlPackage.VALUE_TYPE__LENGTH:
				return new Integer(getLength());
			case IdlPackage.VALUE_TYPE__COMMENT:
				return getComment();
			case IdlPackage.VALUE_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case IdlPackage.VALUE_TYPE__DEFINITIONS:
				return getDefinitions();
			case IdlPackage.VALUE_TYPE__BODY:
				return getBody();
			case IdlPackage.VALUE_TYPE__INHERITED_INTERFACES:
				return getInheritedInterfaces();
			case IdlPackage.VALUE_TYPE__ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case IdlPackage.VALUE_TYPE__LOCAL:
				return isLocal() ? Boolean.TRUE : Boolean.FALSE;
			case IdlPackage.VALUE_TYPE__FORWARD_DCL:
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
			case IdlPackage.VALUE_TYPE__NAME:
				setName((String)newValue);
				return;
			case IdlPackage.VALUE_TYPE__LINE:
				setLine(((Integer)newValue).intValue());
				return;
			case IdlPackage.VALUE_TYPE__POS:
				setPos(((Integer)newValue).intValue());
				return;
			case IdlPackage.VALUE_TYPE__LENGTH:
				setLength(((Integer)newValue).intValue());
				return;
			case IdlPackage.VALUE_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case IdlPackage.VALUE_TYPE__TYPE:
				setType((IdlType)newValue);
				return;
			case IdlPackage.VALUE_TYPE__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection)newValue);
				return;
			case IdlPackage.VALUE_TYPE__BODY:
				getBody().clear();
				getBody().addAll((Collection)newValue);
				return;
			case IdlPackage.VALUE_TYPE__INHERITED_INTERFACES:
				getInheritedInterfaces().clear();
				getInheritedInterfaces().addAll((Collection)newValue);
				return;
			case IdlPackage.VALUE_TYPE__ABSTRACT:
				setAbstract(((Boolean)newValue).booleanValue());
				return;
			case IdlPackage.VALUE_TYPE__LOCAL:
				setLocal(((Boolean)newValue).booleanValue());
				return;
			case IdlPackage.VALUE_TYPE__FORWARD_DCL:
				setForwardDcl((ForwardDcl)newValue);
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
			case IdlPackage.VALUE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IdlPackage.VALUE_TYPE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case IdlPackage.VALUE_TYPE__POS:
				setPos(POS_EDEFAULT);
				return;
			case IdlPackage.VALUE_TYPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case IdlPackage.VALUE_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case IdlPackage.VALUE_TYPE__TYPE:
				setType((IdlType)null);
				return;
			case IdlPackage.VALUE_TYPE__DEFINITIONS:
				getDefinitions().clear();
				return;
			case IdlPackage.VALUE_TYPE__BODY:
				getBody().clear();
				return;
			case IdlPackage.VALUE_TYPE__INHERITED_INTERFACES:
				getInheritedInterfaces().clear();
				return;
			case IdlPackage.VALUE_TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case IdlPackage.VALUE_TYPE__LOCAL:
				setLocal(LOCAL_EDEFAULT);
				return;
			case IdlPackage.VALUE_TYPE__FORWARD_DCL:
				setForwardDcl((ForwardDcl)null);
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
			case IdlPackage.VALUE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IdlPackage.VALUE_TYPE__LINE:
				return line != LINE_EDEFAULT;
			case IdlPackage.VALUE_TYPE__POS:
				return pos != POS_EDEFAULT;
			case IdlPackage.VALUE_TYPE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case IdlPackage.VALUE_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case IdlPackage.VALUE_TYPE__TYPE:
				return type != null;
			case IdlPackage.VALUE_TYPE__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case IdlPackage.VALUE_TYPE__BODY:
				return body != null && !body.isEmpty();
			case IdlPackage.VALUE_TYPE__INHERITED_INTERFACES:
				return inheritedInterfaces != null && !inheritedInterfaces.isEmpty();
			case IdlPackage.VALUE_TYPE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case IdlPackage.VALUE_TYPE__LOCAL:
				return local != LOCAL_EDEFAULT;
			case IdlPackage.VALUE_TYPE__FORWARD_DCL:
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
		if (baseClass == Identifiable.class) {
			switch (derivedFeatureID) {
				case IdlPackage.VALUE_TYPE__NAME: return IdlPackage.IDENTIFIABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == FileRegion.class) {
			switch (derivedFeatureID) {
				case IdlPackage.VALUE_TYPE__LINE: return IdlPackage.FILE_REGION__LINE;
				case IdlPackage.VALUE_TYPE__POS: return IdlPackage.FILE_REGION__POS;
				case IdlPackage.VALUE_TYPE__LENGTH: return IdlPackage.FILE_REGION__LENGTH;
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				case IdlPackage.VALUE_TYPE__COMMENT: return IdlPackage.COMMENTABLE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Definition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IdlType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Typed.class) {
			switch (derivedFeatureID) {
				case IdlPackage.VALUE_TYPE__TYPE: return IdlPackage.TYPED__TYPE;
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
		if (baseClass == IdlTypeDcl.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DefinitionContainer.class) {
			switch (derivedFeatureID) {
				case IdlPackage.VALUE_TYPE__DEFINITIONS: return IdlPackage.DEFINITION_CONTAINER__DEFINITIONS;
				default: return -1;
			}
		}
		if (baseClass == ExportContainer.class) {
			switch (derivedFeatureID) {
				case IdlPackage.VALUE_TYPE__BODY: return IdlPackage.EXPORT_CONTAINER__BODY;
				default: return -1;
			}
		}
		if (baseClass == IdlInterfaceDcl.class) {
			switch (derivedFeatureID) {
				case IdlPackage.VALUE_TYPE__INHERITED_INTERFACES: return IdlPackage.IDL_INTERFACE_DCL__INHERITED_INTERFACES;
				case IdlPackage.VALUE_TYPE__ABSTRACT: return IdlPackage.IDL_INTERFACE_DCL__ABSTRACT;
				case IdlPackage.VALUE_TYPE__LOCAL: return IdlPackage.IDL_INTERFACE_DCL__LOCAL;
				case IdlPackage.VALUE_TYPE__FORWARD_DCL: return IdlPackage.IDL_INTERFACE_DCL__FORWARD_DCL;
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
		if (baseClass == Identifiable.class) {
			switch (baseFeatureID) {
				case IdlPackage.IDENTIFIABLE__NAME: return IdlPackage.VALUE_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == FileRegion.class) {
			switch (baseFeatureID) {
				case IdlPackage.FILE_REGION__LINE: return IdlPackage.VALUE_TYPE__LINE;
				case IdlPackage.FILE_REGION__POS: return IdlPackage.VALUE_TYPE__POS;
				case IdlPackage.FILE_REGION__LENGTH: return IdlPackage.VALUE_TYPE__LENGTH;
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				case IdlPackage.COMMENTABLE__COMMENT: return IdlPackage.VALUE_TYPE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Definition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IdlType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Typed.class) {
			switch (baseFeatureID) {
				case IdlPackage.TYPED__TYPE: return IdlPackage.VALUE_TYPE__TYPE;
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
		if (baseClass == IdlTypeDcl.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DefinitionContainer.class) {
			switch (baseFeatureID) {
				case IdlPackage.DEFINITION_CONTAINER__DEFINITIONS: return IdlPackage.VALUE_TYPE__DEFINITIONS;
				default: return -1;
			}
		}
		if (baseClass == ExportContainer.class) {
			switch (baseFeatureID) {
				case IdlPackage.EXPORT_CONTAINER__BODY: return IdlPackage.VALUE_TYPE__BODY;
				default: return -1;
			}
		}
		if (baseClass == IdlInterfaceDcl.class) {
			switch (baseFeatureID) {
				case IdlPackage.IDL_INTERFACE_DCL__INHERITED_INTERFACES: return IdlPackage.VALUE_TYPE__INHERITED_INTERFACES;
				case IdlPackage.IDL_INTERFACE_DCL__ABSTRACT: return IdlPackage.VALUE_TYPE__ABSTRACT;
				case IdlPackage.IDL_INTERFACE_DCL__LOCAL: return IdlPackage.VALUE_TYPE__LOCAL;
				case IdlPackage.IDL_INTERFACE_DCL__FORWARD_DCL: return IdlPackage.VALUE_TYPE__FORWARD_DCL;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", line: ");
		result.append(line);
		result.append(", pos: ");
		result.append(pos);
		result.append(", length: ");
		result.append(length);
		result.append(", comment: ");
		result.append(comment);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", local: ");
		result.append(local);
		result.append(')');
		return result.toString();
	}

} //ValueTypeImpl
