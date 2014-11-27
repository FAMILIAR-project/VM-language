/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.AttrDef;
import fr.inria.lang.vM.Attributes;
import fr.inria.lang.vM.BasicAttrValuation;
import fr.inria.lang.vM.VMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.AttributesImpl#getAttrDefs <em>Attr Defs</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AttributesImpl#getAttrValuations <em>Attr Valuations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributesImpl extends VmBlockImpl implements Attributes
{
  /**
   * The cached value of the '{@link #getAttrDefs() <em>Attr Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrDefs()
   * @generated
   * @ordered
   */
  protected EList<AttrDef> attrDefs;

  /**
   * The cached value of the '{@link #getAttrValuations() <em>Attr Valuations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrValuations()
   * @generated
   * @ordered
   */
  protected EList<BasicAttrValuation> attrValuations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VMPackage.Literals.ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttrDef> getAttrDefs()
  {
    if (attrDefs == null)
    {
      attrDefs = new EObjectContainmentEList<AttrDef>(AttrDef.class, this, VMPackage.ATTRIBUTES__ATTR_DEFS);
    }
    return attrDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicAttrValuation> getAttrValuations()
  {
    if (attrValuations == null)
    {
      attrValuations = new EObjectContainmentEList<BasicAttrValuation>(BasicAttrValuation.class, this, VMPackage.ATTRIBUTES__ATTR_VALUATIONS);
    }
    return attrValuations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VMPackage.ATTRIBUTES__ATTR_DEFS:
        return ((InternalEList<?>)getAttrDefs()).basicRemove(otherEnd, msgs);
      case VMPackage.ATTRIBUTES__ATTR_VALUATIONS:
        return ((InternalEList<?>)getAttrValuations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VMPackage.ATTRIBUTES__ATTR_DEFS:
        return getAttrDefs();
      case VMPackage.ATTRIBUTES__ATTR_VALUATIONS:
        return getAttrValuations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VMPackage.ATTRIBUTES__ATTR_DEFS:
        getAttrDefs().clear();
        getAttrDefs().addAll((Collection<? extends AttrDef>)newValue);
        return;
      case VMPackage.ATTRIBUTES__ATTR_VALUATIONS:
        getAttrValuations().clear();
        getAttrValuations().addAll((Collection<? extends BasicAttrValuation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VMPackage.ATTRIBUTES__ATTR_DEFS:
        getAttrDefs().clear();
        return;
      case VMPackage.ATTRIBUTES__ATTR_VALUATIONS:
        getAttrValuations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VMPackage.ATTRIBUTES__ATTR_DEFS:
        return attrDefs != null && !attrDefs.isEmpty();
      case VMPackage.ATTRIBUTES__ATTR_VALUATIONS:
        return attrValuations != null && !attrValuations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AttributesImpl
