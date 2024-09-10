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
 * Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum RejectedPromoOfferUpdateReasonType {
  
  OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST"),
  
  OFFER_DUPLICATION("OFFER_DUPLICATION"),
  
  OFFER_NOT_ELIGIBLE_FOR_PROMO("OFFER_NOT_ELIGIBLE_FOR_PROMO"),
  
  OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED("OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED"),
  
  DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED("DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED"),
  
  EMPTY_OLD_PRICE("EMPTY_OLD_PRICE"),
  
  EMPTY_PROMO_PRICE("EMPTY_PROMO_PRICE"),
  
  MAX_PROMO_PRICE_EXCEEDED("MAX_PROMO_PRICE_EXCEEDED"),
  
  PROMO_PRICE_BIGGER_THAN_MAX("PROMO_PRICE_BIGGER_THAN_MAX"),
  
  PROMO_PRICE_SMALLER_THAN_MIN("PROMO_PRICE_SMALLER_THAN_MIN");

  private String value;

  RejectedPromoOfferUpdateReasonType(String value) {
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
  public static RejectedPromoOfferUpdateReasonType fromValue(String value) {
    for (RejectedPromoOfferUpdateReasonType b : RejectedPromoOfferUpdateReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
