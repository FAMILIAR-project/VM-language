/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.BooleanValuation;
import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Valuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.BooleanValuationImpl#isNotSelected <em>Not Selected</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.BooleanValuationImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanValuationImpl extends MinimalEObjectImpl.Container implements BooleanValuation
{
  /**
   * The default value of the '{@link #isNotSelected() <em>Not Selected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotSelected()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_SELECTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotSelected() <em>Not Selected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotSelected()
   * @generated
   * @ordered
   */
  protected boolean notSelected = NOT_SELECTED_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected Feature feature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanValuationImpl()
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
    return VMPackage.Literals.BOOLEAN_VALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotSelected()
  {
    return notSelected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotSelected(boolean newNotSelected)
  {
    boolean oldNotSelected = notSelected;
    notSelected = newNotSelected;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.BOOLEAN_VALUATION__NOT_SELECTED, oldNotSelected, notSelected));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getFeature()
  {
    if (feature != null && feature.eIsProxy())
    {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (Feature)eResolveProxy(oldFeature);
      if (feature != oldFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.BOOLEAN_VALUATION__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(Feature newFeature)
  {
    Feature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.BOOLEAN_VALUATION__FEATURE, oldFeature, feature));
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
      case VMPackage.BOOLEAN_VALUATION__NOT_SELECTED:
        return isNotSelected();
      case VMPackage.BOOLEAN_VALUATION__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VMPackage.BOOLEAN_VALUATION__NOT_SELECTED:
        setNotSelected((Boolean)newValue);
        return;
      case VMPackage.BOOLEAN_VALUATION__FEATURE:
        setFeature((Feature)newValue);
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
      case VMPackage.BOOLEAN_VALUATION__NOT_SELECTED:
        setNotSelected(NOT_SELECTED_EDEFAULT);
        return;
      case VMPackage.BOOLEAN_VALUATION__FEATURE:
        setFeature((Feature)null);
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
      case VMPackage.BOOLEAN_VALUATION__NOT_SELECTED:
        return notSelected != NOT_SELECTED_EDEFAULT;
      case VMPackage.BOOLEAN_VALUATION__FEATURE:
        return feature != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (notSelected: ");
    result.append(notSelected);
    result.append(')');
    return result.toString();
  }

} //BooleanValuationImpl
