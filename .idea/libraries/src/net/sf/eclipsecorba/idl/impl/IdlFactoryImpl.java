/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.impl;

import net.sf.eclipsecorba.idl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdlFactoryImpl extends EFactoryImpl implements IdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdlFactory init() {
		try {
			IdlFactory theIdlFactory = (IdlFactory)EPackage.Registry.INSTANCE.getEFactory("http:///net/sf/eclipsecorba/idl.ecore"); 
			if (theIdlFactory != null) {
				return theIdlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IdlPackage.SPECIFICATION: return createSpecification();
			case IdlPackage.DECLARATOR: return createDeclarator();
			case IdlPackage.MODULE: return createModule();
			case IdlPackage.IDL_CONST_DCL: return createIdlConstDcl();
			case IdlPackage.IDL_EXCEPTION: return createIdlException();
			case IdlPackage.MEMBER: return createMember();
			case IdlPackage.FORWARD_DCL: return createForwardDcl();
			case IdlPackage.IDL_INTERFACE_DCL: return createIdlInterfaceDcl();
			case IdlPackage.COMMENTABLE: return createCommentable();
			case IdlPackage.VALUE_TYPE: return createValueType();
			case IdlPackage.EXPORT_CONTAINER: return createExportContainer();
			case IdlPackage.VALUE_FORWARD_DCL: return createValueForwardDcl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declarator createDeclarator() {
		DeclaratorImpl declarator = new DeclaratorImpl();
		return declarator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlConstDcl createIdlConstDcl() {
		IdlConstDclImpl idlConstDcl = new IdlConstDclImpl();
		return idlConstDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlException createIdlException() {
		IdlExceptionImpl idlException = new IdlExceptionImpl();
		return idlException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardDcl createForwardDcl() {
		ForwardDclImpl forwardDcl = new ForwardDclImpl();
		return forwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlInterfaceDcl createIdlInterfaceDcl() {
		IdlInterfaceDclImpl idlInterfaceDcl = new IdlInterfaceDclImpl();
		return idlInterfaceDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commentable createCommentable() {
		CommentableImpl commentable = new CommentableImpl();
		return commentable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportContainer createExportContainer() {
		ExportContainerImpl exportContainer = new ExportContainerImpl();
		return exportContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueForwardDcl createValueForwardDcl() {
		ValueForwardDclImpl valueForwardDcl = new ValueForwardDclImpl();
		return valueForwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlPackage getIdlPackage() {
		return (IdlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static IdlPackage getPackage() {
		return IdlPackage.eINSTANCE;
	}

} //IdlFactoryImpl
