/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.AdvancedAttrValuation;
import fr.inria.lang.vM.TableBasedValuationByAttribute;
import fr.inria.lang.vM.TableBasedValuationByFeature;
import fr.inria.lang.vM.TableBasedValuationByFeatureAndClone;
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
 * An implementation of the model object '<em><b>Advanced Attr Valuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.AdvancedAttrValuationImpl#getAttVsVal <em>Att Vs Val</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AdvancedAttrValuationImpl#getFeatVsVal <em>Feat Vs Val</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AdvancedAttrValuationImpl#getAttVsValForMultiFeature <em>Att Vs Val For Multi Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvancedAttrValuationImpl extends ExtendedValuationImpl implements AdvancedAttrValuation
{
  /**
   * The cached value of the '{@link #getAttVsVal() <em>Att Vs Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttVsVal()
   * @generated
   * @ordered
   */
  protected TableBasedValuationByFeature attVsVal;

  /**
   * The cached value of the '{@link #getFeatVsVal() <em>Feat Vs Val</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatVsVal()
   * @generated
   * @ordered
   */
  protected EList<TableBasedValuationByAttribute> featVsVal;

  /**
   * The cached value of the '{@link #getAttVsValForMultiFeature() <em>Att Vs Val For Multi Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttVsValForMultiFeature()
   * @generated
   * @ordered
   */
  protected TableBasedValuationByFeatureAndClone attVsValForMultiFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdvancedAttrValuationImpl()
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
    return VMPackage.Literals.ADVANCED_ATTR_VALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableBasedValuationByFeature getAttVsVal()
  {
    return attVsVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttVsVal(TableBasedValuationByFeature newAttVsVal, NotificationChain msgs)
  {
    TableBasedValuationByFeature oldAttVsVal = attVsVal;
    attVsVal = newAttVsVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL, oldAttVsVal, newAttVsVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttVsVal(TableBasedValuationByFeature newAttVsVal)
  {
    if (newAttVsVal != attVsVal)
    {
      NotificationChain msgs = null;
      if (attVsVal != null)
        msgs = ((InternalEObject)attVsVal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL, null, msgs);
      if (newAttVsVal != null)
        msgs = ((InternalEObject)newAttVsVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL, null, msgs);
      msgs = basicSetAttVsVal(newAttVsVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL, newAttVsVal, newAttVsVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableBasedValuationByAttribute> getFeatVsVal()
  {
    if (featVsVal == null)
    {
      featVsVal = new EObjectContainmentEList<TableBasedValuationByAttribute>(TableBasedValuationByAttribute.class, this, VMPackage.ADVANCED_ATTR_VALUATION__FEAT_VS_VAL);
    }
    return featVsVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableBasedValuationByFeatureAndClone getAttVsValForMultiFeature()
  {
    return attVsValForMultiFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttVsValForMultiFeature(TableBasedValuationByFeatureAndClone newAttVsValForMultiFeature, NotificationChain msgs)
  {
    TableBasedValuationByFeatureAndClone oldAttVsValForMultiFeature = attVsValForMultiFeature;
    attVsValForMultiFeature = newAttVsValForMultiFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE, oldAttVsValForMultiFeature, newAttVsValForMultiFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttVsValForMultiFeature(TableBasedValuationByFeatureAndClone newAttVsValForMultiFeature)
  {
    if (newAttVsValForMultiFeature != attVsValForMultiFeature)
    {
      NotificationChain msgs = null;
      if (attVsValForMultiFeature != null)
        msgs = ((InternalEObject)attVsValForMultiFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE, null, msgs);
      if (newAttVsValForMultiFeature != null)
        msgs = ((InternalEObject)newAttVsValForMultiFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE, null, msgs);
      msgs = basicSetAttVsValForMultiFeature(newAttVsValForMultiFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE, newAttVsValForMultiFeature, newAttVsValForMultiFeature));
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
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL:
        return basicSetAttVsVal(null, msgs);
      case VMPackage.ADVANCED_ATTR_VALUATION__FEAT_VS_VAL:
        return ((InternalEList<?>)getFeatVsVal()).basicRemove(otherEnd, msgs);
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE:
        return basicSetAttVsValForMultiFeature(null, msgs);
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
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL:
        return getAttVsVal();
      case VMPackage.ADVANCED_ATTR_VALUATION__FEAT_VS_VAL:
        return getFeatVsVal();
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE:
        return getAttVsValForMultiFeature();
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
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL:
        setAttVsVal((TableBasedValuationByFeature)newValue);
        return;
      case VMPackage.ADVANCED_ATTR_VALUATION__FEAT_VS_VAL:
        getFeatVsVal().clear();
        getFeatVsVal().addAll((Collection<? extends TableBasedValuationByAttribute>)newValue);
        return;
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE:
        setAttVsValForMultiFeature((TableBasedValuationByFeatureAndClone)newValue);
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
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL:
        setAttVsVal((TableBasedValuationByFeature)null);
        return;
      case VMPackage.ADVANCED_ATTR_VALUATION__FEAT_VS_VAL:
        getFeatVsVal().clear();
        return;
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE:
        setAttVsValForMultiFeature((TableBasedValuationByFeatureAndClone)null);
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
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL:
        return attVsVal != null;
      case VMPackage.ADVANCED_ATTR_VALUATION__FEAT_VS_VAL:
        return featVsVal != null && !featVsVal.isEmpty();
      case VMPackage.ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE:
        return attVsValForMultiFeature != null;
    }
    return super.eIsSet(featureID);
  }

} //AdvancedAttrValuationImpl
