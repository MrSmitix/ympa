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
 * Статус товара в акции:  * `AUTO` — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * `PARTIALLY_AUTO` — добавлен автоматически у части магазинов.  * `MANUAL` — добавлен вручную.  * `NOT_PARTICIPATING` — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum PromoOfferParticipationStatusType {
  
  AUTO("AUTO"),
  
  PARTIALLY_AUTO("PARTIALLY_AUTO"),
  
  MANUAL("MANUAL"),
  
  NOT_PARTICIPATING("NOT_PARTICIPATING");

  private String value;

  PromoOfferParticipationStatusType(String value) {
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
  public static PromoOfferParticipationStatusType fromValue(String value) {
    for (PromoOfferParticipationStatusType b : PromoOfferParticipationStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

