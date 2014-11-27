/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureImpl#isNotTranslatable <em>Not Translatable</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureImpl#isRunTime <em>Run Time</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureImpl#isNotDecidable <em>Not Decidable</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureImpl#getMin <em>Min</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureImpl#getMax <em>Max</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends FeatureDefinitionImpl implements Feature
{
  /**
   * The default value of the '{@link #isNotTranslatable() <em>Not Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotTranslatable()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_TRANSLATABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotTranslatable() <em>Not Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotTranslatable()
   * @generated
   * @ordered
   */
  protected boolean notTranslatable = NOT_TRANSLATABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isRunTime() <em>Run Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRunTime()
   * @generated
   * @ordered
   */
  protected static final boolean RUN_TIME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRunTime() <em>Run Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRunTime()
   * @generated
   * @ordered
   */
  protected boolean runTime = RUN_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #isNotDecidable() <em>Not Decidable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotDecidable()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_DECIDABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotDecidable() <em>Not Decidable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotDecidable()
   * @generated
   * @ordered
   */
  protected boolean notDecidable = NOT_DECIDABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final String MIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected String min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final String MAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected String max = MAX_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
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
    return VMPackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotTranslatable()
  {
    return notTranslatable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotTranslatable(boolean newNotTranslatable)
  {
    boolean oldNotTranslatable = notTranslatable;
    notTranslatable = newNotTranslatable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE__NOT_TRANSLATABLE, oldNotTranslatable, notTranslatable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRunTime()
  {
    return runTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunTime(boolean newRunTime)
  {
    boolean oldRunTime = runTime;
    runTime = newRunTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE__RUN_TIME, oldRunTime, runTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotDecidable()
  {
    return notDecidable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotDecidable(boolean newNotDecidable)
  {
    boolean oldNotDecidable = notDecidable;
    notDecidable = newNotDecidable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE__NOT_DECIDABLE, oldNotDecidable, notDecidable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional)
  {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE__OPTIONAL, oldOptional, optional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(String newMin)
  {
    String oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(String newMax)
  {
    String oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE__MAX, oldMax, max));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE__NAME, oldName, name));
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
      case VMPackage.FEATURE__NOT_TRANSLATABLE:
        return isNotTranslatable();
      case VMPackage.FEATURE__RUN_TIME:
        return isRunTime();
      case VMPackage.FEATURE__NOT_DECIDABLE:
        return isNotDecidable();
      case VMPackage.FEATURE__OPTIONAL:
        return isOptional();
      case VMPackage.FEATURE__MIN:
        return getMin();
      case VMPackage.FEATURE__MAX:
        return getMax();
      case VMPackage.FEATURE__NAME:
        return getName();
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
      case VMPackage.FEATURE__NOT_TRANSLATABLE:
        setNotTranslatable((Boolean)newValue);
        return;
      case VMPackage.FEATURE__RUN_TIME:
        setRunTime((Boolean)newValue);
        return;
      case VMPackage.FEATURE__NOT_DECIDABLE:
        setNotDecidable((Boolean)newValue);
        return;
      case VMPackage.FEATURE__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case VMPackage.FEATURE__MIN:
        setMin((String)newValue);
        return;
      case VMPackage.FEATURE__MAX:
        setMax((String)newValue);
        return;
      case VMPackage.FEATURE__NAME:
        setName((String)newValue);
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
      case VMPackage.FEATURE__NOT_TRANSLATABLE:
        setNotTranslatable(NOT_TRANSLATABLE_EDEFAULT);
        return;
      case VMPackage.FEATURE__RUN_TIME:
        setRunTime(RUN_TIME_EDEFAULT);
        return;
      case VMPackage.FEATURE__NOT_DECIDABLE:
        setNotDecidable(NOT_DECIDABLE_EDEFAULT);
        return;
      case VMPackage.FEATURE__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
        return;
      case VMPackage.FEATURE__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case VMPackage.FEATURE__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case VMPackage.FEATURE__NAME:
        setName(NAME_EDEFAULT);
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
      case VMPackage.FEATURE__NOT_TRANSLATABLE:
        return notTranslatable != NOT_TRANSLATABLE_EDEFAULT;
      case VMPackage.FEATURE__RUN_TIME:
        return runTime != RUN_TIME_EDEFAULT;
      case VMPackage.FEATURE__NOT_DECIDABLE:
        return notDecidable != NOT_DECIDABLE_EDEFAULT;
      case VMPackage.FEATURE__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
      case VMPackage.FEATURE__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case VMPackage.FEATURE__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
      case VMPackage.FEATURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (notTranslatable: ");
    result.append(notTranslatable);
    result.append(", runTime: ");
    result.append(runTime);
    result.append(", notDecidable: ");
    result.append(notDecidable);
    result.append(", optional: ");
    result.append(optional);
    result.append(", min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FeatureImpl
