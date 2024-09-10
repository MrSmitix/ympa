package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Услуга Маркета:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CalculatedTariffType {

    @JsonProperty("AGENCY_COMMISSION") AGENCY_COMMISSION(String.valueOf("AGENCY_COMMISSION")), @JsonProperty("PAYMENT_TRANSFER") PAYMENT_TRANSFER(String.valueOf("PAYMENT_TRANSFER")), @JsonProperty("FEE") FEE(String.valueOf("FEE")), @JsonProperty("DELIVERY_TO_CUSTOMER") DELIVERY_TO_CUSTOMER(String.valueOf("DELIVERY_TO_CUSTOMER")), @JsonProperty("CROSSREGIONAL_DELIVERY") CROSSREGIONAL_DELIVERY(String.valueOf("CROSSREGIONAL_DELIVERY")), @JsonProperty("EXPRESS_DELIVERY") EXPRESS_DELIVERY(String.valueOf("EXPRESS_DELIVERY")), @JsonProperty("SORTING") SORTING(String.valueOf("SORTING")), @JsonProperty("MIDDLE_MILE") MIDDLE_MILE(String.valueOf("MIDDLE_MILE"));


    private String value;

    CalculatedTariffType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CalculatedTariffType fromValue(String value) {
        for (CalculatedTariffType b : CalculatedTariffType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



