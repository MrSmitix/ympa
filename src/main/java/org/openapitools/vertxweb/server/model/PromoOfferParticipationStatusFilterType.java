package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Фильтр для товаров, которые добавлены в акцию вручную:  * &#x60;MANUALLY_ADDED&#x60; — товары, которые добавлены вручную.  * &#x60;NOT_MANUALLY_ADDED&#x60;— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр &#x60;statusType&#x60;, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Фильтр для товаров, которые добавлены в акцию вручную:  * &#x60;MANUALLY_ADDED&#x60; — товары, которые добавлены вручную.  * &#x60;NOT_MANUALLY_ADDED&#x60;— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр &#x60;statusType&#x60;, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */
public enum PromoOfferParticipationStatusFilterType {
  
  MANUALLY_ADDED("MANUALLY_ADDED"),
  
  NOT_MANUALLY_ADDED("NOT_MANUALLY_ADDED");

  private String value;

  PromoOfferParticipationStatusFilterType(String value) {
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

  public static PromoOfferParticipationStatusFilterType fromValue(String value) {
    for (PromoOfferParticipationStatusFilterType b : PromoOfferParticipationStatusFilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}