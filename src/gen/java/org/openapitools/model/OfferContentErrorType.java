package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Типы ошибок:  * &#x60;OFFER_NOT_FOUND&#x60; — такого товара нет в каталоге. * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_MISMATCH&#x60; — указана категория, которая не совпадает с категорией товара. * &#x60;UNKNOWN_PARAMETER&#x60; — передана характеристика, которой нет среди характеристик категории. * &#x60;UNEXPECTED_BOOLEAN_VALUE&#x60; — вместо boolean-значения передано что-то другое. * &#x60;NUMBER_FORMAT&#x60; — передана строка, не обозначающая число, вместо числа. * &#x60;VALUE_BLANK&#x60; — передано пустое значение. * &#x60;INVALID_UNIT_ID&#x60; — передана единица измерения, недопустимая для характеристики. * &#x60;INVALID_GROUP_ID_LENGTH&#x60; — в названии превышено допустимое значение символов — 255. * &#x60;INVALID_GROUP_ID_CHARACTERS&#x60; — переданы [недопустимые символы](*ascii-code). 
 */
public enum OfferContentErrorType {
  
  OFFER_NOT_FOUND("OFFER_NOT_FOUND"),
  
  UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
  
  CATEGORY_MISMATCH("CATEGORY_MISMATCH"),
  
  UNKNOWN_PARAMETER("UNKNOWN_PARAMETER"),
  
  UNEXPECTED_BOOLEAN_VALUE("UNEXPECTED_BOOLEAN_VALUE"),
  
  NUMBER_FORMAT("NUMBER_FORMAT"),
  
  VALUE_BLANK("VALUE_BLANK"),
  
  INVALID_UNIT_ID("INVALID_UNIT_ID"),
  
  INVALID_GROUP_ID_LENGTH("INVALID_GROUP_ID_LENGTH"),
  
  INVALID_GROUP_ID_CHARACTERS("INVALID_GROUP_ID_CHARACTERS");

  private String value;

  OfferContentErrorType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OfferContentErrorType fromString(String s) {
      for (OfferContentErrorType b : OfferContentErrorType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferContentErrorType fromValue(String value) {
    for (OfferContentErrorType b : OfferContentErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


