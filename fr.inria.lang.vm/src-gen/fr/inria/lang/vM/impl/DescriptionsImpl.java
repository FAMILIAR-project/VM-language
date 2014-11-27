/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.AttributeDescription;
import fr.inria.lang.vM.Descriptions;
import fr.inria.lang.vM.FeatureDescription;
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
 * An implementation of the model object '<em><b>Descriptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.DescriptionsImpl#getFeaturesDescriptions <em>Features Descriptions</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.DescriptionsImpl#getAttributesDescriptions <em>Attributes Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionsImpl extends VmBlockImpl implements Descriptions
{
  /**
   * The cached value of the '{@link #getFeaturesDescriptions() <em>Features Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeaturesDescriptions()
   * @generated
   * @ordered
   */
  protected EList<FeatureDescription> featuresDescriptions;

  /**
   * The cached value of the '{@link #getAttributesDescriptions() <em>Attributes Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributesDescriptions()
   * @generated
   * @ordered
   */
  protected EList<AttributeDescription> attributesDescriptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescriptionsImpl()
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
    return VMPackage.Literals.DESCRIPTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureDescription> getFeaturesDescriptions()
  {
    if (featuresDescriptions == null)
    {
      featuresDescriptions = new EObjectContainmentEList<FeatureDescription>(FeatureDescription.class, this, VMPackage.DESCRIPTIONS__FEATURES_DESCRIPTIONS);
    }
    return featuresDescriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeDescription> getAttributesDescriptions()
  {
    if (attributesDescriptions == null)
    {
      attributesDescriptions = new EObjectContainmentEList<AttributeDescription>(AttributeDescription.class, this, VMPackage.DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS);
    }
    return attributesDescriptions;
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
      case VMPackage.DESCRIPTIONS__FEATURES_DESCRIPTIONS:
        return ((InternalEList<?>)getFeaturesDescriptions()).basicRemove(otherEnd, msgs);
      case VMPackage.DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS:
        return ((InternalEList<?>)getAttributesDescriptions()).basicRemove(otherEnd, msgs);
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
      case VMPackage.DESCRIPTIONS__FEATURES_DESCRIPTIONS:
        return getFeaturesDescriptions();
      case VMPackage.DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS:
        return getAttributesDescriptions();
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
      case VMPackage.DESCRIPTIONS__FEATURES_DESCRIPTIONS:
        getFeaturesDescriptions().clear();
        getFeaturesDescriptions().addAll((Collection<? extends FeatureDescription>)newValue);
        return;
      case VMPackage.DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS:
        getAttributesDescriptions().clear();
        getAttributesDescriptions().addAll((Collection<? extends AttributeDescription>)newValue);
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
      case VMPackage.DESCRIPTIONS__FEATURES_DESCRIPTIONS:
        getFeaturesDescriptions().clear();
        return;
      case VMPackage.DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS:
        getAttributesDescriptions().clear();
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
      case VMPackage.DESCRIPTIONS__FEATURES_DESCRIPTIONS:
        return featuresDescriptions != null && !featuresDescriptions.isEmpty();
      case VMPackage.DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS:
        return attributesDescriptions != null && !attributesDescriptions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DescriptionsImpl
