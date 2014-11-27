/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.BooleanValuation;
import fr.inria.lang.vM.Configuration;
import fr.inria.lang.vM.ExtendedValuation;
import fr.inria.lang.vM.VMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.ConfigurationImpl#getBooleanValuation <em>Boolean Valuation</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.ConfigurationImpl#getExtendedValuation <em>Extended Valuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration
{
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
   * The cached value of the '{@link #getBooleanValuation() <em>Boolean Valuation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValuation()
   * @generated
   * @ordered
   */
  protected EList<BooleanValuation> booleanValuation;

  /**
   * The cached value of the '{@link #getExtendedValuation() <em>Extended Valuation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedValuation()
   * @generated
   * @ordered
   */
  protected EList<ExtendedValuation> extendedValuation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationImpl()
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
    return VMPackage.Literals.CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.CONFIGURATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BooleanValuation> getBooleanValuation()
  {
    if (booleanValuation == null)
    {
      booleanValuation = new EObjectContainmentEList<BooleanValuation>(BooleanValuation.class, this, VMPackage.CONFIGURATION__BOOLEAN_VALUATION);
    }
    return booleanValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExtendedValuation> getExtendedValuation()
  {
    if (extendedValuation == null)
    {
      extendedValuation = new EObjectContainmentEList<ExtendedValuation>(ExtendedValuation.class, this, VMPackage.CONFIGURATION__EXTENDED_VALUATION);
    }
    return extendedValuation;
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
      case VMPackage.CONFIGURATION__BOOLEAN_VALUATION:
        return ((InternalEList<?>)getBooleanValuation()).basicRemove(otherEnd, msgs);
      case VMPackage.CONFIGURATION__EXTENDED_VALUATION:
        return ((InternalEList<?>)getExtendedValuation()).basicRemove(otherEnd, msgs);
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
      case VMPackage.CONFIGURATION__NAME:
        return getName();
      case VMPackage.CONFIGURATION__BOOLEAN_VALUATION:
        return getBooleanValuation();
      case VMPackage.CONFIGURATION__EXTENDED_VALUATION:
        return getExtendedValuation();
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
      case VMPackage.CONFIGURATION__NAME:
        setName((String)newValue);
        return;
      case VMPackage.CONFIGURATION__BOOLEAN_VALUATION:
        getBooleanValuation().clear();
        getBooleanValuation().addAll((Collection<? extends BooleanValuation>)newValue);
        return;
      case VMPackage.CONFIGURATION__EXTENDED_VALUATION:
        getExtendedValuation().clear();
        getExtendedValuation().addAll((Collection<? extends ExtendedValuation>)newValue);
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
      case VMPackage.CONFIGURATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VMPackage.CONFIGURATION__BOOLEAN_VALUATION:
        getBooleanValuation().clear();
        return;
      case VMPackage.CONFIGURATION__EXTENDED_VALUATION:
        getExtendedValuation().clear();
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
      case VMPackage.CONFIGURATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VMPackage.CONFIGURATION__BOOLEAN_VALUATION:
        return booleanValuation != null && !booleanValuation.isEmpty();
      case VMPackage.CONFIGURATION__EXTENDED_VALUATION:
        return extendedValuation != null && !extendedValuation.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ConfigurationImpl
