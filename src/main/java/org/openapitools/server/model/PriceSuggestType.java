package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип цены:  * `BUYBOX` — самая низкая цена на товар, по которой он продается сейчас. Эта цена обновляется в режиме реального времени. Если вы установите цену ниже, начнет показываться ваше предложение. Если для этого значения в параметре `price` указана цена, которая совпадает с вашей, значит, ваш товар уже показывается на витрине. Если кроме вас этот товар продают другие продавцы по такой же цене, их предложения также будут отображаться вместе с вашими по очереди. * `DEFAULT_OFFER` — рекомендованная Маркетом цена, которая привлекает покупателей. Рассчитывается только для популярных на сервисе товаров и обновляется раз в четыре часа. * `MIN_PRICE_MARKET` — минимальная цена на Маркете. Самая низкая цена среди всех предложений товара на Маркете во всех регионах, включая те, которые не видны на витрине. Эта цена обновляется в режиме реального времени и обеспечивает большее количество показов на Маркете, чем самая низкая или рекомендованная цена. 
 */

public enum PriceSuggestType {

    BUYBOX("BUYBOX"),
    DEFAULT_OFFER("DEFAULT_OFFER"),
    MIN_PRICE_MARKET("MIN_PRICE_MARKET");

    private String value;

    PriceSuggestType(String value) {
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
    public static PriceSuggestType fromValue(String text) {
        for (PriceSuggestType b : PriceSuggestType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

