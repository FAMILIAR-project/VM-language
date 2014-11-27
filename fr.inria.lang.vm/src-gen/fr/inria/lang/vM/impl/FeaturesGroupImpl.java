/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.FeatureDefinition;
import fr.inria.lang.vM.FeaturesGroup;
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
 * An implementation of the model object '<em><b>Features Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.FeaturesGroupImpl#getGroupedFeatures <em>Grouped Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeaturesGroupImpl extends FeatureDefinitionImpl implements FeaturesGroup
{
  /**
   * The cached value of the '{@link #getGroupedFeatures() <em>Grouped Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupedFeatures()
   * @generated
   * @ordered
   */
  protected EList<FeatureDefinition> groupedFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeaturesGroupImpl()
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
    return VMPackage.Literals.FEATURES_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureDefinition> getGroupedFeatures()
  {
    if (groupedFeatures == null)
    {
      groupedFeatures = new EObjectContainmentEList<FeatureDefinition>(FeatureDefinition.class, this, VMPackage.FEATURES_GROUP__GROUPED_FEATURES);
    }
    return groupedFeatures;
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
      case VMPackage.FEATURES_GROUP__GROUPED_FEATURES:
        return ((InternalEList<?>)getGroupedFeatures()).basicRemove(otherEnd, msgs);
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
      case VMPackage.FEATURES_GROUP__GROUPED_FEATURES:
        return getGroupedFeatures();
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
      case VMPackage.FEATURES_GROUP__GROUPED_FEATURES:
        getGroupedFeatures().clear();
        getGroupedFeatures().addAll((Collection<? extends FeatureDefinition>)newValue);
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
      case VMPackage.FEATURES_GROUP__GROUPED_FEATURES:
        getGroupedFeatures().clear();
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
      case VMPackage.FEATURES_GROUP__GROUPED_FEATURES:
        return groupedFeatures != null && !groupedFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeaturesGroupImpl
