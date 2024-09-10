package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Причина отклонения изменения:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU.  * &#x60;OFFER_DUPLICATION&#x60; — один и тот же товар передан несколько раз.  * &#x60;OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар не подходит под условия акции.  * &#x60;OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED&#x60; — товар не добавлен в акцию по техническим причинам.  * &#x60;DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED&#x60; — истек срок добавления товаров в акцию.  * &#x60;EMPTY_OLD_PRICE&#x60; — не указана зачеркнутая цена.  * &#x60;EMPTY_PROMO_PRICE&#x60; — не указана цена по акции.  * &#x60;MAX_PROMO_PRICE_EXCEEDED&#x60; — цена по акции превышает максимально возможную цену для участия в акции.  * &#x60;PROMO_PRICE_BIGGER_THAN_MAX&#x60; — цена по акции больше 95% от зачеркнутой цены.  * &#x60;PROMO_PRICE_SMALLER_THAN_MIN&#x60; — цена по акции меньше 1% от зачеркнутой цены. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Причина отклонения изменения:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU.  * &#x60;OFFER_DUPLICATION&#x60; — один и тот же товар передан несколько раз.  * &#x60;OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар не подходит под условия акции.  * &#x60;OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED&#x60; — товар не добавлен в акцию по техническим причинам.  * &#x60;DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED&#x60; — истек срок добавления товаров в акцию.  * &#x60;EMPTY_OLD_PRICE&#x60; — не указана зачеркнутая цена.  * &#x60;EMPTY_PROMO_PRICE&#x60; — не указана цена по акции.  * &#x60;MAX_PROMO_PRICE_EXCEEDED&#x60; — цена по акции превышает максимально возможную цену для участия в акции.  * &#x60;PROMO_PRICE_BIGGER_THAN_MAX&#x60; — цена по акции больше 95% от зачеркнутой цены.  * &#x60;PROMO_PRICE_SMALLER_THAN_MIN&#x60; — цена по акции меньше 1% от зачеркнутой цены. 
 */
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

  public static RejectedPromoOfferUpdateReasonType fromValue(String value) {
    for (RejectedPromoOfferUpdateReasonType b : RejectedPromoOfferUpdateReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}