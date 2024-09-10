package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Статус карточки товара:  * &#x60;HAS_CARD_CAN_NOT_UPDATE&#x60; — Карточка Маркета. * &#x60;HAS_CARD_CAN_UPDATE&#x60; — Можно дополнить. * &#x60;HAS_CARD_CAN_UPDATE_ERRORS&#x60; — Изменения не приняты. * &#x60;HAS_CARD_CAN_UPDATE_PROCESSING&#x60; — Изменения на проверке. * &#x60;NO_CARD_NEED_CONTENT&#x60; — Создайте карточку. * &#x60;NO_CARD_MARKET_WILL_CREATE&#x60; — Создаст Маркет. * &#x60;NO_CARD_ERRORS&#x60; — Не создана из-за ошибки. * &#x60;NO_CARD_PROCESSING&#x60; — Проверяем данные. * &#x60;NO_CARD_ADD_TO_CAMPAIGN&#x60; — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferCardStatusType fromValue(String value) {
    for (OfferCardStatusType b : OfferCardStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}