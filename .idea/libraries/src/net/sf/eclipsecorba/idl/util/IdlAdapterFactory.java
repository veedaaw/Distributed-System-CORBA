/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.util;

import net.sf.eclipsecorba.idl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.eclipsecorba.idl.IdlPackage
 * @generated
 */
public class IdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IdlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdlSwitch modelSwitch =
		new IdlSwitch() {
			public Object caseFileRegion(FileRegion object) {
				return createFileRegionAdapter();
			}
			public Object caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			public Object caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			public Object caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			public Object caseDefinitionContainer(DefinitionContainer object) {
				return createDefinitionContainerAdapter();
			}
			public Object caseElement(Element object) {
				return createElementAdapter();
			}
			public Object caseDeclarator(Declarator object) {
				return createDeclaratorAdapter();
			}
			public Object caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			public Object caseTyped(Typed object) {
				return createTypedAdapter();
			}
			public Object caseModule(Module object) {
				return createModuleAdapter();
			}
			public Object caseIdlConstDcl(IdlConstDcl object) {
				return createIdlConstDclAdapter();
			}
			public Object caseIdlException(IdlException object) {
				return createIdlExceptionAdapter();
			}
			public Object caseMember(Member object) {
				return createMemberAdapter();
			}
			public Object caseMemberContainer(MemberContainer object) {
				return createMemberContainerAdapter();
			}
			public Object caseForwardDcl(ForwardDcl object) {
				return createForwardDclAdapter();
			}
			public Object caseIdlInterfaceDcl(IdlInterfaceDcl object) {
				return createIdlInterfaceDclAdapter();
			}
			public Object caseExport(Export object) {
				return createExportAdapter();
			}
			public Object caseIdlType(IdlType object) {
				return createIdlTypeAdapter();
			}
			public Object caseIdlTypeDcl(IdlTypeDcl object) {
				return createIdlTypeDclAdapter();
			}
			public Object caseCommentable(Commentable object) {
				return createCommentableAdapter();
			}
			public Object caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			public Object caseExportContainer(ExportContainer object) {
				return createExportContainerAdapter();
			}
			public Object caseValueForwardDcl(ValueForwardDcl object) {
				return createValueForwardDclAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.FileRegion <em>File Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.FileRegion
	 * @generated
	 */
	public Adapter createFileRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.DefinitionContainer <em>Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.DefinitionContainer
	 * @generated
	 */
	public Adapter createDefinitionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Declarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Declarator
	 * @generated
	 */
	public Adapter createDeclaratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Typed
	 * @generated
	 */
	public Adapter createTypedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.IdlConstDcl <em>Const Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.IdlConstDcl
	 * @generated
	 */
	public Adapter createIdlConstDclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.IdlException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.IdlException
	 * @generated
	 */
	public Adapter createIdlExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.MemberContainer <em>Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.MemberContainer
	 * @generated
	 */
	public Adapter createMemberContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.ForwardDcl <em>Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.ForwardDcl
	 * @generated
	 */
	public Adapter createForwardDclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl <em>Interface Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.IdlInterfaceDcl
	 * @generated
	 */
	public Adapter createIdlInterfaceDclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Export
	 * @generated
	 */
	public Adapter createExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.IdlType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.IdlType
	 * @generated
	 */
	public Adapter createIdlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.IdlTypeDcl <em>Type Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.IdlTypeDcl
	 * @generated
	 */
	public Adapter createIdlTypeDclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.Commentable
	 * @generated
	 */
	public Adapter createCommentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.ExportContainer <em>Export Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.ExportContainer
	 * @generated
	 */
	public Adapter createExportContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.ValueForwardDcl <em>Value Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.ValueForwardDcl
	 * @generated
	 */
	public Adapter createValueForwardDclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IdlAdapterFactory
