/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. 
 */

/**
 * Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. 
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

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static RejectedPromoOfferUpdateReasonType fromValue(String text) {
for (RejectedPromoOfferUpdateReasonType b : RejectedPromoOfferUpdateReasonType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


