package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

public enum PromoOfferParticipationStatusFilterType {

    MANUALLY_ADDED("MANUALLY_ADDED"),
    NOT_MANUALLY_ADDED("NOT_MANUALLY_ADDED");

    private String value;

    PromoOfferParticipationStatusFilterType(String value) {
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
    public static PromoOfferParticipationStatusFilterType fromValue(String text) {
        for (PromoOfferParticipationStatusFilterType b : PromoOfferParticipationStatusFilterType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

