/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.VMPackage;
import fr.inria.lang.vM.Version;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.VersionImpl#getMain <em>Main</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.VersionImpl#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version
{
  /**
   * The default value of the '{@link #getMain() <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected static final int MAIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected int main = MAIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected EList<Integer> tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VersionImpl()
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
    return VMPackage.Literals.VERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMain(int newMain)
  {
    int oldMain = main;
    main = newMain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.VERSION__MAIN, oldMain, main));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getTail()
  {
    if (tail == null)
    {
      tail = new EDataTypeEList<Integer>(Integer.class, this, VMPackage.VERSION__TAIL);
    }
    return tail;
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
      case VMPackage.VERSION__MAIN:
        return getMain();
      case VMPackage.VERSION__TAIL:
        return getTail();
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
      case VMPackage.VERSION__MAIN:
        setMain((Integer)newValue);
        return;
      case VMPackage.VERSION__TAIL:
        getTail().clear();
        getTail().addAll((Collection<? extends Integer>)newValue);
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
      case VMPackage.VERSION__MAIN:
        setMain(MAIN_EDEFAULT);
        return;
      case VMPackage.VERSION__TAIL:
        getTail().clear();
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
      case VMPackage.VERSION__MAIN:
        return main != MAIN_EDEFAULT;
      case VMPackage.VERSION__TAIL:
        return tail != null && !tail.isEmpty();
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
    result.append(" (main: ");
    result.append(main);
    result.append(", tail: ");
    result.append(tail);
    result.append(')');
    return result.toString();
  }

} //VersionImpl
