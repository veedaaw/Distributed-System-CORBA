/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types.util;

import net.sf.eclipsecorba.idl.Commentable;
import net.sf.eclipsecorba.idl.Definition;
import net.sf.eclipsecorba.idl.Element;
import net.sf.eclipsecorba.idl.Export;
import net.sf.eclipsecorba.idl.FileRegion;
import net.sf.eclipsecorba.idl.Identifiable;
import net.sf.eclipsecorba.idl.IdlType;
import net.sf.eclipsecorba.idl.IdlTypeDcl;
import net.sf.eclipsecorba.idl.MemberContainer;
import net.sf.eclipsecorba.idl.Typed;
import net.sf.eclipsecorba.idl.TypedElement;

import net.sf.eclipsecorba.idl.types.Any;
import net.sf.eclipsecorba.idl.types.EnumType;
import net.sf.eclipsecorba.idl.types.IdlChar;
import net.sf.eclipsecorba.idl.types.IdlString;
import net.sf.eclipsecorba.idl.types.LongDouble;
import net.sf.eclipsecorba.idl.types.LongLong;
import net.sf.eclipsecorba.idl.types.Octet;
import net.sf.eclipsecorba.idl.types.PrimitiveType;
import net.sf.eclipsecorba.idl.types.SequenceType;
import net.sf.eclipsecorba.idl.types.StructForwardDcl;
import net.sf.eclipsecorba.idl.types.StructType;
import net.sf.eclipsecorba.idl.types.TemplateType;
import net.sf.eclipsecorba.idl.types.TypeDef;
import net.sf.eclipsecorba.idl.types.TypesPackage;
import net.sf.eclipsecorba.idl.types.ULong;
import net.sf.eclipsecorba.idl.types.ULongLong;
import net.sf.eclipsecorba.idl.types.UShort;
import net.sf.eclipsecorba.idl.types.UnionForwardDcl;
import net.sf.eclipsecorba.idl.types.UnionType;
import net.sf.eclipsecorba.idl.types.VoidType;
import net.sf.eclipsecorba.idl.types.WChar;
import net.sf.eclipsecorba.idl.types.WString;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.eclipsecorba.idl.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
	protected TypesSwitch modelSwitch =
		new TypesSwitch() {
			public Object caseTypeDef(TypeDef object) {
				return createTypeDefAdapter();
			}
			public Object caseVoidType(VoidType object) {
				return createVoidTypeAdapter();
			}
			public Object caseUnionType(UnionType object) {
				return createUnionTypeAdapter();
			}
			public Object caseEnumType(EnumType object) {
				return createEnumTypeAdapter();
			}
			public Object caseStructType(StructType object) {
				return createStructTypeAdapter();
			}
			public Object caseTemplateType(TemplateType object) {
				return createTemplateTypeAdapter();
			}
			public Object caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			public Object caseIdlString(IdlString object) {
				return createIdlStringAdapter();
			}
			public Object caseWString(WString object) {
				return createWStringAdapter();
			}
			public Object casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			public Object caseShort(net.sf.eclipsecorba.idl.types.Short object) {
				return createShortAdapter();
			}
			public Object caseLong(net.sf.eclipsecorba.idl.types.Long object) {
				return createLongAdapter();
			}
			public Object caseOctet(Octet object) {
				return createOctetAdapter();
			}
			public Object caseFloat(net.sf.eclipsecorba.idl.types.Float object) {
				return createFloatAdapter();
			}
			public Object caseDouble(net.sf.eclipsecorba.idl.types.Double object) {
				return createDoubleAdapter();
			}
			public Object caseIdlChar(IdlChar object) {
				return createIdlCharAdapter();
			}
			public Object caseWChar(WChar object) {
				return createWCharAdapter();
			}
			public Object caseBoolean(net.sf.eclipsecorba.idl.types.Boolean object) {
				return createBooleanAdapter();
			}
			public Object caseLongLong(LongLong object) {
				return createLongLongAdapter();
			}
			public Object caseLongDouble(LongDouble object) {
				return createLongDoubleAdapter();
			}
			public Object caseUShort(UShort object) {
				return createUShortAdapter();
			}
			public Object caseULong(ULong object) {
				return createULongAdapter();
			}
			public Object caseULongLong(ULongLong object) {
				return createULongLongAdapter();
			}
			public Object caseAny(Any object) {
				return createAnyAdapter();
			}
			public Object caseUnionForwardDcl(UnionForwardDcl object) {
				return createUnionForwardDclAdapter();
			}
			public Object caseStructForwardDcl(StructForwardDcl object) {
				return createStructForwardDclAdapter();
			}
			public Object caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			public Object caseFileRegion(FileRegion object) {
				return createFileRegionAdapter();
			}
			public Object caseElement(Element object) {
				return createElementAdapter();
			}
			public Object caseTyped(Typed object) {
				return createTypedAdapter();
			}
			public Object caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			public Object caseCommentable(Commentable object) {
				return createCommentableAdapter();
			}
			public Object caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			public Object caseIdlType(IdlType object) {
				return createIdlTypeAdapter();
			}
			public Object caseExport(Export object) {
				return createExportAdapter();
			}
			public Object caseIdlTypeDcl(IdlTypeDcl object) {
				return createIdlTypeDclAdapter();
			}
			public Object caseMemberContainer(MemberContainer object) {
				return createMemberContainerAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.TypeDef
	 * @generated
	 */
	public Adapter createTypeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.VoidType
	 * @generated
	 */
	public Adapter createVoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.UnionType
	 * @generated
	 */
	public Adapter createUnionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.EnumType
	 * @generated
	 */
	public Adapter createEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.StructType
	 * @generated
	 */
	public Adapter createStructTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.TemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.TemplateType
	 * @generated
	 */
	public Adapter createTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.IdlString <em>Idl String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.IdlString
	 * @generated
	 */
	public Adapter createIdlStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.WString <em>WString</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.WString
	 * @generated
	 */
	public Adapter createWStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.Short
	 * @generated
	 */
	public Adapter createShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.Long
	 * @generated
	 */
	public Adapter createLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.Octet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.Octet
	 * @generated
	 */
	public Adapter createOctetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.Double
	 * @generated
	 */
	public Adapter createDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.IdlChar <em>Idl Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.IdlChar
	 * @generated
	 */
	public Adapter createIdlCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.WChar <em>WChar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.WChar
	 * @generated
	 */
	public Adapter createWCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.LongLong <em>Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.LongLong
	 * @generated
	 */
	public Adapter createLongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.LongDouble
	 * @generated
	 */
	public Adapter createLongDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.UShort <em>UShort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.UShort
	 * @generated
	 */
	public Adapter createUShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.ULong <em>ULong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.ULong
	 * @generated
	 */
	public Adapter createULongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.ULongLong <em>ULong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.ULongLong
	 * @generated
	 */
	public Adapter createULongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.UnionForwardDcl <em>Union Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.UnionForwardDcl
	 * @generated
	 */
	public Adapter createUnionForwardDclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.eclipsecorba.idl.types.StructForwardDcl <em>Struct Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.eclipsecorba.idl.types.StructForwardDcl
	 * @generated
	 */
	public Adapter createStructForwardDclAdapter() {
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

} //TypesAdapterFactory
