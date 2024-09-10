package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  @JsonCreator
  public static CalculatedTariffType fromValue(String value) {
    for (CalculatedTariffType b : CalculatedTariffType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

