package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Предупреждение, которое появилось при добавлении товара:  * &#x60;DEEP_DISCOUNT_OFFER&#x60; — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * &#x60;CATALOG_PRICE_IS_LOWER_THAN_PROMO&#x60; — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * &#x60;SHOP_PRICES_ARE_LOWER_THAN_PROMO&#x60; — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * &#x60;PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE&#x60; — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * &#x60;SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар в отдельном магазине не подходит под условия акции. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PromoOfferUpdateWarningCodeType {

    @JsonProperty("DEEP_DISCOUNT_OFFER") DEEP_DISCOUNT_OFFER(String.valueOf("DEEP_DISCOUNT_OFFER")), @JsonProperty("CATALOG_PRICE_IS_LOWER_THAN_PROMO") CATALOG_PRICE_IS_LOWER_THAN_PROMO(String.valueOf("CATALOG_PRICE_IS_LOWER_THAN_PROMO")), @JsonProperty("SHOP_PRICES_ARE_LOWER_THAN_PROMO") SHOP_PRICES_ARE_LOWER_THAN_PROMO(String.valueOf("SHOP_PRICES_ARE_LOWER_THAN_PROMO")), @JsonProperty("PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE") PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE(String.valueOf("PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE")), @JsonProperty("SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO") SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO(String.valueOf("SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO"));


    private String value;

    PromoOfferUpdateWarningCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PromoOfferUpdateWarningCodeType fromValue(String value) {
        for (PromoOfferUpdateWarningCodeType b : PromoOfferUpdateWarningCodeType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



