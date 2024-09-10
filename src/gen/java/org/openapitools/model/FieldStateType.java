package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Фильтр по заполненности или незаполненности поля:  * &#x60;SPECIFIED&#x60; — вывести товары, у которых поле заполнено. * &#x60;EMPTY&#x60; — вывести товары, у которых поле не заполнено. 
 */
public enum FieldStateType {
  
  SPECIFIED("SPECIFIED"),
  
  EMPTY("EMPTY");

  private String value;

  FieldStateType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldStateType fromValue(String value) {
    for (FieldStateType b : FieldStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

