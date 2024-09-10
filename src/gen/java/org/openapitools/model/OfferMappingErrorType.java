package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_MISMATCH&#x60; — указана категория, которая не совпадает с категорией товара. * &#x60;EMPTY_MARKET_CATEGORY&#x60; — не указана категория Маркета при передаче характеристик категории. * &#x60;UNKNOWN_PARAMETER&#x60; — передана характеристика, которой нет среди характеристик категории. * &#x60;UNEXPECTED_BOOLEAN_VALUE&#x60; — вместо boolean-значения передано что-то другое. * &#x60;NUMBER_FORMAT&#x60; — передана строка, не обозначающая число, вместо числа. * &#x60;VALUE_BLANK&#x60; — передано пустое значение. * &#x60;INVALID_UNIT_ID&#x60; — передана единица измерения, недопустимая для характеристики. * &#x60;INVALID_GROUP_ID_LENGTH&#x60; — в названии превышено допустимое значение символов — 255. * &#x60;INVALID_GROUP_ID_CHARACTERS&#x60; — переданы [недопустимые символы](*ascii-code). * &#x60;INVALID_PICKER_URL&#x60; — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `EMPTY_MARKET_CATEGORY` — не указана категория Маркета при передаче характеристик категории. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). * `INVALID_PICKER_URL` — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferMappingErrorType fromValue(String text) {
    for (OfferMappingErrorType b : OfferMappingErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


