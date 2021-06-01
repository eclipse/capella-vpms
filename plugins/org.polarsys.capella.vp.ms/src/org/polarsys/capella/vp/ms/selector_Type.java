/*******************************************************************************
 * Copyright (c) 2017, 2020 THALES GLOBAL SERVICES.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.vp.ms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>selector Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.polarsys.capella.vp.ms.MsPackage#getselector_Type()
 * @model
 * @generated
 */
public enum selector_Type implements Enumerator {
  /**
   * The '<em><b>Inclusion</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #INCLUSION_VALUE
   * @generated
   * @ordered
   */
  INCLUSION(0, "inclusion", "inclusion"),

  /**
   * The '<em><b>Exclusion</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #EXCLUSION_VALUE
   * @generated
   * @ordered
   */
  EXCLUSION(1, "exclusion", "exclusion");

  /**
   * The '<em><b>Inclusion</b></em>' literal value. <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Inclusion</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @see #INCLUSION
   * @model name="inclusion"
   * @generated
   * @ordered
   */
  public static final int INCLUSION_VALUE = 0;

  /**
   * The '<em><b>Exclusion</b></em>' literal value. <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Exclusion</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @see #EXCLUSION
   * @model name="exclusion"
   * @generated
   * @ordered
   */
  public static final int EXCLUSION_VALUE = 1;

  /**
   * An array of all the '<em><b>selector Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final selector_Type[] VALUES_ARRAY = new selector_Type[] { INCLUSION, EXCLUSION, };

  /**
   * A public read-only list of all the '<em><b>selector Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<selector_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>selector Type</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static selector_Type get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      selector_Type result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>selector Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static selector_Type getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      selector_Type result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>selector Type</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static selector_Type get(int value) {
    switch (value) {
    case INCLUSION_VALUE:
      return INCLUSION;
    case EXCLUSION_VALUE:
      return EXCLUSION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private selector_Type(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }

} // selector_Type