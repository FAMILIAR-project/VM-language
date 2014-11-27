/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.IntegerAttrDefBounded;
import fr.inria.lang.vM.IntegerAttrDefComplement;
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
 * An implementation of the model object '<em><b>Integer Attr Def Bounded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.IntegerAttrDefBoundedImpl#getComplements <em>Complements</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.IntegerAttrDefBoundedImpl#getComplement <em>Complement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerAttrDefBoundedImpl extends IntegerAttrDefImpl implements IntegerAttrDefBounded
{
  /**
   * The cached value of the '{@link #getComplements() <em>Complements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComplements()
   * @generated
   * @ordered
   */
  protected EList<IntegerAttrDefComplement> complements;

  /**
   * The cached value of the '{@link #getComplement() <em>Complement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComplement()
   * @generated
   * @ordered
   */
  protected EList<IntegerAttrDefComplement> complement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerAttrDefBoundedImpl()
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
    return VMPackage.Literals.INTEGER_ATTR_DEF_BOUNDED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerAttrDefComplement> getComplements()
  {
    if (complements == null)
    {
      complements = new EObjectContainmentEList<IntegerAttrDefComplement>(IntegerAttrDefComplement.class, this, VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS);
    }
    return complements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerAttrDefComplement> getComplement()
  {
    if (complement == null)
    {
      complement = new EObjectContainmentEList<IntegerAttrDefComplement>(IntegerAttrDefComplement.class, this, VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT);
    }
    return complement;
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
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS:
        return ((InternalEList<?>)getComplements()).basicRemove(otherEnd, msgs);
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT:
        return ((InternalEList<?>)getComplement()).basicRemove(otherEnd, msgs);
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
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS:
        return getComplements();
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT:
        return getComplement();
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
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS:
        getComplements().clear();
        getComplements().addAll((Collection<? extends IntegerAttrDefComplement>)newValue);
        return;
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT:
        getComplement().clear();
        getComplement().addAll((Collection<? extends IntegerAttrDefComplement>)newValue);
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
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS:
        getComplements().clear();
        return;
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT:
        getComplement().clear();
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
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS:
        return complements != null && !complements.isEmpty();
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT:
        return complement != null && !complement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IntegerAttrDefBoundedImpl
