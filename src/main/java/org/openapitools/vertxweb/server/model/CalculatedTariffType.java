package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Услуга Маркета:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Услуга Маркета:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */
public enum CalculatedTariffType {
  
  AGENCY_COMMISSION("AGENCY_COMMISSION"),
  
  PAYMENT_TRANSFER("PAYMENT_TRANSFER"),
  
  FEE("FEE"),
  
  DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),
  
  CROSSREGIONAL_DELIVERY("CROSSREGIONAL_DELIVERY"),
  
  EXPRESS_DELIVERY("EXPRESS_DELIVERY"),
  
  SORTING("SORTING"),
  
  MIDDLE_MILE("MIDDLE_MILE");

  private String value;

  CalculatedTariffType(String value) {
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

  public static CalculatedTariffType fromValue(String value) {
    for (CalculatedTariffType b : CalculatedTariffType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}