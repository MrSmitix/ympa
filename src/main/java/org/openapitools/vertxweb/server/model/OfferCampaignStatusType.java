package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Статус товара:  * &#x60;PUBLISHED&#x60; — Готов к продаже. * &#x60;CHECKING&#x60; — На проверке. * &#x60;DISABLED_BY_PARTNER&#x60; — Скрыт вами. * &#x60;REJECTED_BY_MARKET&#x60; — Отклонен. * &#x60;DISABLED_AUTOMATICALLY&#x60; — Исправьте ошибки. * &#x60;CREATING_CARD&#x60; — Создается карточка. * &#x60;NO_CARD&#x60; — Нужна карточка. * &#x60;NO_STOCKS&#x60; — Нет на складе. * &#x60;ARCHIVED&#x60; — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус товара:  * &#x60;PUBLISHED&#x60; — Готов к продаже. * &#x60;CHECKING&#x60; — На проверке. * &#x60;DISABLED_BY_PARTNER&#x60; — Скрыт вами. * &#x60;REJECTED_BY_MARKET&#x60; — Отклонен. * &#x60;DISABLED_AUTOMATICALLY&#x60; — Исправьте ошибки. * &#x60;CREATING_CARD&#x60; — Создается карточка. * &#x60;NO_CARD&#x60; — Нужна карточка. * &#x60;NO_STOCKS&#x60; — Нет на складе. * &#x60;ARCHIVED&#x60; — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 */
public enum OfferCampaignStatusType {
  
  PUBLISHED("PUBLISHED"),
  
  CHECKING("CHECKING"),
  
  DISABLED_BY_PARTNER("DISABLED_BY_PARTNER"),
  
  DISABLED_AUTOMATICALLY("DISABLED_AUTOMATICALLY"),
  
  REJECTED_BY_MARKET("REJECTED_BY_MARKET"),
  
  CREATING_CARD("CREATING_CARD"),
  
  NO_CARD("NO_CARD"),
  
  NO_STOCKS("NO_STOCKS"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  OfferCampaignStatusType(String value) {
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

  public static OfferCampaignStatusType fromValue(String value) {
    for (OfferCampaignStatusType b : OfferCampaignStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}