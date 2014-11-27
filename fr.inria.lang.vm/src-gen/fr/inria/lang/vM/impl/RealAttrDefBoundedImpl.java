/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.RealAttrDefBounded;
import fr.inria.lang.vM.RealAttrDefComplement;
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
 * An implementation of the model object '<em><b>Real Attr Def Bounded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.RealAttrDefBoundedImpl#getComplement <em>Complement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealAttrDefBoundedImpl extends RealAttrDefImpl implements RealAttrDefBounded
{
  /**
   * The cached value of the '{@link #getComplement() <em>Complement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComplement()
   * @generated
   * @ordered
   */
  protected EList<RealAttrDefComplement> complement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealAttrDefBoundedImpl()
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
    return VMPackage.Literals.REAL_ATTR_DEF_BOUNDED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RealAttrDefComplement> getComplement()
  {
    if (complement == null)
    {
      complement = new EObjectContainmentEList<RealAttrDefComplement>(RealAttrDefComplement.class, this, VMPackage.REAL_ATTR_DEF_BOUNDED__COMPLEMENT);
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
      case VMPackage.REAL_ATTR_DEF_BOUNDED__COMPLEMENT:
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
      case VMPackage.REAL_ATTR_DEF_BOUNDED__COMPLEMENT:
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
      case VMPackage.REAL_ATTR_DEF_BOUNDED__COMPLEMENT:
        getComplement().clear();
        getComplement().addAll((Collection<? extends RealAttrDefComplement>)newValue);
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
      case VMPackage.REAL_ATTR_DEF_BOUNDED__COMPLEMENT:
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
      case VMPackage.REAL_ATTR_DEF_BOUNDED__COMPLEMENT:
        return complement != null && !complement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RealAttrDefBoundedImpl
