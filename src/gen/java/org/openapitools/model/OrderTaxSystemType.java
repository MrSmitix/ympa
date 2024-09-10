package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Система налогообложения (СНО) магазина на момент оформления заказа:  * &#x60;ECHN&#x60; — единый сельскохозяйственный налог (ЕСХН).  * &#x60;ENVD&#x60; — единый налог на вмененный доход (ЕНВД).  * &#x60;OSN&#x60; — общая система налогообложения (ОСН).  * &#x60;PSN&#x60; — патентная система налогообложения (ПСН).  * &#x60;USN&#x60; — упрощенная система налогообложения (УСН).  * &#x60;USN_MINUS_COST&#x60; — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * &#x60;NPD&#x60; — налог на профессиональный доход (НПД).  * &#x60;UNKNOWN_VALUE&#x60; — неизвестное значение. Используется только совместно с параметром &#x60;payment-method&#x3D;YANDEX&#x60;. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderTaxSystemType {

    @JsonProperty("OSN") OSN(String.valueOf("OSN")), @JsonProperty("USN") USN(String.valueOf("USN")), @JsonProperty("USN_MINUS_COST") USN_MINUS_COST(String.valueOf("USN_MINUS_COST")), @JsonProperty("ENVD") ENVD(String.valueOf("ENVD")), @JsonProperty("ECHN") ECHN(String.valueOf("ECHN")), @JsonProperty("PSN") PSN(String.valueOf("PSN")), @JsonProperty("NPD") NPD(String.valueOf("NPD")), @JsonProperty("UNKNOWN_VALUE") UNKNOWN_VALUE(String.valueOf("UNKNOWN_VALUE"));


    private String value;

    OrderTaxSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderTaxSystemType fromValue(String value) {
        for (OrderTaxSystemType b : OrderTaxSystemType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



