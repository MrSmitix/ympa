package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип цены:  * &#x60;BUYBOX&#x60; — самая низкая цена на товар, по которой он продается сейчас. Эта цена обновляется в режиме реального времени. Если вы установите цену ниже, начнет показываться ваше предложение. Если для этого значения в параметре &#x60;price&#x60; указана цена, которая совпадает с вашей, значит, ваш товар уже показывается на витрине. Если кроме вас этот товар продают другие продавцы по такой же цене, их предложения также будут отображаться вместе с вашими по очереди. * &#x60;DEFAULT_OFFER&#x60; — рекомендованная Маркетом цена, которая привлекает покупателей. Рассчитывается только для популярных на сервисе товаров и обновляется раз в четыре часа. * &#x60;MIN_PRICE_MARKET&#x60; — минимальная цена на Маркете. Самая низкая цена среди всех предложений товара на Маркете во всех регионах, включая те, которые не видны на витрине. Эта цена обновляется в режиме реального времени и обеспечивает большее количество показов на Маркете, чем самая низкая или рекомендованная цена. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PriceSuggestType {

    @JsonProperty("BUYBOX") BUYBOX(String.valueOf("BUYBOX")), @JsonProperty("DEFAULT_OFFER") DEFAULT_OFFER(String.valueOf("DEFAULT_OFFER")), @JsonProperty("MIN_PRICE_MARKET") MIN_PRICE_MARKET(String.valueOf("MIN_PRICE_MARKET"));


    private String value;

    PriceSuggestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PriceSuggestType fromValue(String value) {
        for (PriceSuggestType b : PriceSuggestType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



