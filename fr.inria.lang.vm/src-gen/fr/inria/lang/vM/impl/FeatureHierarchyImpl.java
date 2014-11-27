/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.FeatureDefinition;
import fr.inria.lang.vM.FeatureHierarchy;
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
 * An implementation of the model object '<em><b>Feature Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureHierarchyImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureHierarchyImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureHierarchyImpl extends FeatureDefinitionImpl implements FeatureHierarchy
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Feature parent;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<FeatureDefinition> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureHierarchyImpl()
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
    return VMPackage.Literals.FEATURE_HIERARCHY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Feature newParent, NotificationChain msgs)
  {
    Feature oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE_HIERARCHY__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Feature newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.FEATURE_HIERARCHY__PARENT, null, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.FEATURE_HIERARCHY__PARENT, null, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE_HIERARCHY__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureDefinition> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<FeatureDefinition>(FeatureDefinition.class, this, VMPackage.FEATURE_HIERARCHY__CHILDREN);
    }
    return children;
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
      case VMPackage.FEATURE_HIERARCHY__PARENT:
        return basicSetParent(null, msgs);
      case VMPackage.FEATURE_HIERARCHY__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case VMPackage.FEATURE_HIERARCHY__PARENT:
        return getParent();
      case VMPackage.FEATURE_HIERARCHY__CHILDREN:
        return getChildren();
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
      case VMPackage.FEATURE_HIERARCHY__PARENT:
        setParent((Feature)newValue);
        return;
      case VMPackage.FEATURE_HIERARCHY__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends FeatureDefinition>)newValue);
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
      case VMPackage.FEATURE_HIERARCHY__PARENT:
        setParent((Feature)null);
        return;
      case VMPackage.FEATURE_HIERARCHY__CHILDREN:
        getChildren().clear();
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
      case VMPackage.FEATURE_HIERARCHY__PARENT:
        return parent != null;
      case VMPackage.FEATURE_HIERARCHY__CHILDREN:
        return children != null && !children.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeatureHierarchyImpl
