package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Статус товара в акции:  * &#x60;AUTO&#x60; — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * &#x60;PARTIALLY_AUTO&#x60; — добавлен автоматически у части магазинов.  * &#x60;MANUAL&#x60; — добавлен вручную.  * &#x60;NOT_PARTICIPATING&#x60; — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */
public enum PromoOfferParticipationStatusType {
  
  AUTO("AUTO"),
  
  PARTIALLY_AUTO("PARTIALLY_AUTO"),
  
  MANUAL("MANUAL"),
  
  NOT_PARTICIPATING("NOT_PARTICIPATING");

  private String value;

  PromoOfferParticipationStatusType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static PromoOfferParticipationStatusType fromString(String s) {
      for (PromoOfferParticipationStatusType b : PromoOfferParticipationStatusType.values()) {
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
  public static PromoOfferParticipationStatusType fromValue(String value) {
    for (PromoOfferParticipationStatusType b : PromoOfferParticipationStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


