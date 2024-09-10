package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус карточки товара:  * &#x60;HAS_CARD_CAN_NOT_UPDATE&#x60; — Карточка Маркета. * &#x60;HAS_CARD_CAN_UPDATE&#x60; — Можно дополнить. * &#x60;HAS_CARD_CAN_UPDATE_ERRORS&#x60; — Изменения не приняты. * &#x60;HAS_CARD_CAN_UPDATE_PROCESSING&#x60; — Изменения на проверке. * &#x60;NO_CARD_NEED_CONTENT&#x60; — Создайте карточку. * &#x60;NO_CARD_MARKET_WILL_CREATE&#x60; — Создаст Маркет. * &#x60;NO_CARD_ERRORS&#x60; — Не создана из-за ошибки. * &#x60;NO_CARD_PROCESSING&#x60; — Проверяем данные. * &#x60;NO_CARD_ADD_TO_CAMPAIGN&#x60; — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
 */
public enum OfferCardStatusType {
  
  HAS_CARD_CAN_NOT_UPDATE("HAS_CARD_CAN_NOT_UPDATE"),
  
  HAS_CARD_CAN_UPDATE("HAS_CARD_CAN_UPDATE"),
  
  HAS_CARD_CAN_UPDATE_ERRORS("HAS_CARD_CAN_UPDATE_ERRORS"),
  
  HAS_CARD_CAN_UPDATE_PROCESSING("HAS_CARD_CAN_UPDATE_PROCESSING"),
  
  NO_CARD_NEED_CONTENT("NO_CARD_NEED_CONTENT"),
  
  NO_CARD_MARKET_WILL_CREATE("NO_CARD_MARKET_WILL_CREATE"),
  
  NO_CARD_ERRORS("NO_CARD_ERRORS"),
  
  NO_CARD_PROCESSING("NO_CARD_PROCESSING"),
  
  NO_CARD_ADD_TO_CAMPAIGN("NO_CARD_ADD_TO_CAMPAIGN");

  private String value;

  OfferCardStatusType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OfferCardStatusType fromString(String s) {
      for (OfferCardStatusType b : OfferCardStatusType.values()) {
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
  public static OfferCardStatusType fromValue(String value) {
    for (OfferCardStatusType b : OfferCardStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


