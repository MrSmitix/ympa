package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус товара в акции:  * &#x60;AUTO&#x60; — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * &#x60;PARTIALLY_AUTO&#x60; — добавлен автоматически у части магазинов.  * &#x60;MANUAL&#x60; — добавлен вручную.  * &#x60;NOT_PARTICIPATING&#x60; — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PromoOfferParticipationStatusType {

    @JsonProperty("AUTO") AUTO(String.valueOf("AUTO")), @JsonProperty("PARTIALLY_AUTO") PARTIALLY_AUTO(String.valueOf("PARTIALLY_AUTO")), @JsonProperty("MANUAL") MANUAL(String.valueOf("MANUAL")), @JsonProperty("NOT_PARTICIPATING") NOT_PARTICIPATING(String.valueOf("NOT_PARTICIPATING"));


    private String value;

    PromoOfferParticipationStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PromoOfferParticipationStatusType fromValue(String value) {
        for (PromoOfferParticipationStatusType b : PromoOfferParticipationStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



