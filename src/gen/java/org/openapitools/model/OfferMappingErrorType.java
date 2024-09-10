package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_MISMATCH&#x60; — указана категория, которая не совпадает с категорией товара. * &#x60;EMPTY_MARKET_CATEGORY&#x60; — не указана категория Маркета при передаче характеристик категории. * &#x60;UNKNOWN_PARAMETER&#x60; — передана характеристика, которой нет среди характеристик категории. * &#x60;UNEXPECTED_BOOLEAN_VALUE&#x60; — вместо boolean-значения передано что-то другое. * &#x60;NUMBER_FORMAT&#x60; — передана строка, не обозначающая число, вместо числа. * &#x60;VALUE_BLANK&#x60; — передано пустое значение. * &#x60;INVALID_UNIT_ID&#x60; — передана единица измерения, недопустимая для характеристики. * &#x60;INVALID_GROUP_ID_LENGTH&#x60; — в названии превышено допустимое значение символов — 255. * &#x60;INVALID_GROUP_ID_CHARACTERS&#x60; — переданы [недопустимые символы](*ascii-code). * &#x60;INVALID_PICKER_URL&#x60; — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
 */
public enum OfferMappingErrorType {
  
  UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
  
  CATEGORY_MISMATCH("CATEGORY_MISMATCH"),
  
  EMPTY_MARKET_CATEGORY("EMPTY_MARKET_CATEGORY"),
  
  UNKNOWN_PARAMETER("UNKNOWN_PARAMETER"),
  
  UNEXPECTED_BOOLEAN_VALUE("UNEXPECTED_BOOLEAN_VALUE"),
  
  NUMBER_FORMAT("NUMBER_FORMAT"),
  
  VALUE_BLANK("VALUE_BLANK"),
  
  INVALID_UNIT_ID("INVALID_UNIT_ID"),
  
  INVALID_GROUP_ID_LENGTH("INVALID_GROUP_ID_LENGTH"),
  
  INVALID_GROUP_ID_CHARACTERS("INVALID_GROUP_ID_CHARACTERS"),
  
  INVALID_PICKER_URL("INVALID_PICKER_URL");

  private String value;

  OfferMappingErrorType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferMappingErrorType fromValue(String value) {
    for (OfferMappingErrorType b : OfferMappingErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

