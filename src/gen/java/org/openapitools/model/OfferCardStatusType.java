package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус карточки товара:  * &#x60;HAS_CARD_CAN_NOT_UPDATE&#x60; — Карточка Маркета. * &#x60;HAS_CARD_CAN_UPDATE&#x60; — Можно дополнить. * &#x60;HAS_CARD_CAN_UPDATE_ERRORS&#x60; — Изменения не приняты. * &#x60;HAS_CARD_CAN_UPDATE_PROCESSING&#x60; — Изменения на проверке. * &#x60;NO_CARD_NEED_CONTENT&#x60; — Создайте карточку. * &#x60;NO_CARD_MARKET_WILL_CREATE&#x60; — Создаст Маркет. * &#x60;NO_CARD_ERRORS&#x60; — Не создана из-за ошибки. * &#x60;NO_CARD_PROCESSING&#x60; — Проверяем данные. * &#x60;NO_CARD_ADD_TO_CAMPAIGN&#x60; — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OfferCardStatusType {

    @JsonProperty("HAS_CARD_CAN_NOT_UPDATE") HAS_CARD_CAN_NOT_UPDATE(String.valueOf("HAS_CARD_CAN_NOT_UPDATE")), @JsonProperty("HAS_CARD_CAN_UPDATE") HAS_CARD_CAN_UPDATE(String.valueOf("HAS_CARD_CAN_UPDATE")), @JsonProperty("HAS_CARD_CAN_UPDATE_ERRORS") HAS_CARD_CAN_UPDATE_ERRORS(String.valueOf("HAS_CARD_CAN_UPDATE_ERRORS")), @JsonProperty("HAS_CARD_CAN_UPDATE_PROCESSING") HAS_CARD_CAN_UPDATE_PROCESSING(String.valueOf("HAS_CARD_CAN_UPDATE_PROCESSING")), @JsonProperty("NO_CARD_NEED_CONTENT") NO_CARD_NEED_CONTENT(String.valueOf("NO_CARD_NEED_CONTENT")), @JsonProperty("NO_CARD_MARKET_WILL_CREATE") NO_CARD_MARKET_WILL_CREATE(String.valueOf("NO_CARD_MARKET_WILL_CREATE")), @JsonProperty("NO_CARD_ERRORS") NO_CARD_ERRORS(String.valueOf("NO_CARD_ERRORS")), @JsonProperty("NO_CARD_PROCESSING") NO_CARD_PROCESSING(String.valueOf("NO_CARD_PROCESSING")), @JsonProperty("NO_CARD_ADD_TO_CAMPAIGN") NO_CARD_ADD_TO_CAMPAIGN(String.valueOf("NO_CARD_ADD_TO_CAMPAIGN"));


    private String value;

    OfferCardStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfferCardStatusType fromValue(String value) {
        for (OfferCardStatusType b : OfferCardStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



