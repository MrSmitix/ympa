package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус товара:  * &#x60;PUBLISHED&#x60; — Готов к продаже. * &#x60;CHECKING&#x60; — На проверке. * &#x60;DISABLED_BY_PARTNER&#x60; — Скрыт вами. * &#x60;REJECTED_BY_MARKET&#x60; — Отклонен. * &#x60;DISABLED_AUTOMATICALLY&#x60; — Исправьте ошибки. * &#x60;CREATING_CARD&#x60; — Создается карточка. * &#x60;NO_CARD&#x60; — Нужна карточка. * &#x60;NO_STOCKS&#x60; — Нет на складе. * &#x60;ARCHIVED&#x60; — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OfferCampaignStatusType {

    @JsonProperty("PUBLISHED") PUBLISHED(String.valueOf("PUBLISHED")), @JsonProperty("CHECKING") CHECKING(String.valueOf("CHECKING")), @JsonProperty("DISABLED_BY_PARTNER") DISABLED_BY_PARTNER(String.valueOf("DISABLED_BY_PARTNER")), @JsonProperty("DISABLED_AUTOMATICALLY") DISABLED_AUTOMATICALLY(String.valueOf("DISABLED_AUTOMATICALLY")), @JsonProperty("REJECTED_BY_MARKET") REJECTED_BY_MARKET(String.valueOf("REJECTED_BY_MARKET")), @JsonProperty("CREATING_CARD") CREATING_CARD(String.valueOf("CREATING_CARD")), @JsonProperty("NO_CARD") NO_CARD(String.valueOf("NO_CARD")), @JsonProperty("NO_STOCKS") NO_STOCKS(String.valueOf("NO_STOCKS")), @JsonProperty("ARCHIVED") ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    OfferCampaignStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfferCampaignStatusType fromValue(String value) {
        for (OfferCampaignStatusType b : OfferCampaignStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



