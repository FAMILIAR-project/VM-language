/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Integer_ATT_ID;
import fr.inria.lang.vM.PairFeatureInteger;
import fr.inria.lang.vM.TableBasedValuationByAttributeForInteger;
import fr.inria.lang.vM.VMPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Table Based Valuation By Attribute For Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.TableBasedValuationByAttributeForIntegerImpl#getRefAtt <em>Ref Att</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.TableBasedValuationByAttributeForIntegerImpl#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableBasedValuationByAttributeForIntegerImpl extends TableBasedValuationByAttributeImpl implements TableBasedValuationByAttributeForInteger
{
  /**
   * The cached value of the '{@link #getRefAtt() <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefAtt()
   * @generated
   * @ordered
   */
  protected Integer_ATT_ID refAtt;

  /**
   * The cached value of the '{@link #getPairs() <em>Pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPairs()
   * @generated
   * @ordered
   */
  protected EList<PairFeatureInteger> pairs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableBasedValuationByAttributeForIntegerImpl()
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
    return VMPackage.Literals.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer_ATT_ID getRefAtt()
  {
    if (refAtt != null && refAtt.eIsProxy())
    {
      InternalEObject oldRefAtt = (InternalEObject)refAtt;
      refAtt = (Integer_ATT_ID)eResolveProxy(oldRefAtt);
      if (refAtt != oldRefAtt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT, oldRefAtt, refAtt));
      }
    }
    return refAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer_ATT_ID basicGetRefAtt()
  {
    return refAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefAtt(Integer_ATT_ID newRefAtt)
  {
    Integer_ATT_ID oldRefAtt = refAtt;
    refAtt = newRefAtt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT, oldRefAtt, refAtt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PairFeatureInteger> getPairs()
  {
    if (pairs == null)
    {
      pairs = new EObjectContainmentEList<PairFeatureInteger>(PairFeatureInteger.class, this, VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS);
    }
    return pairs;
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
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS:
        return ((InternalEList<?>)getPairs()).basicRemove(otherEnd, msgs);
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
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT:
        if (resolve) return getRefAtt();
        return basicGetRefAtt();
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS:
        return getPairs();
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
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT:
        setRefAtt((Integer_ATT_ID)newValue);
        return;
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS:
        getPairs().clear();
        getPairs().addAll((Collection<? extends PairFeatureInteger>)newValue);
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
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT:
        setRefAtt((Integer_ATT_ID)null);
        return;
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS:
        getPairs().clear();
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
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT:
        return refAtt != null;
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS:
        return pairs != null && !pairs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TableBasedValuationByAttributeForIntegerImpl
