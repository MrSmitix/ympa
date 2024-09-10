package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AffectedOrderQualityRatingComponentType {

    @JsonProperty("DBS_CANCELLATION_RATE") DBS_CANCELLATION_RATE(String.valueOf("DBS_CANCELLATION_RATE")), @JsonProperty("DBS_LATE_DELIVERY_RATE") DBS_LATE_DELIVERY_RATE(String.valueOf("DBS_LATE_DELIVERY_RATE")), @JsonProperty("FBS_CANCELLATION_RATE") FBS_CANCELLATION_RATE(String.valueOf("FBS_CANCELLATION_RATE")), @JsonProperty("FBS_LATE_SHIP_RATE") FBS_LATE_SHIP_RATE(String.valueOf("FBS_LATE_SHIP_RATE"));


    private String value;

    AffectedOrderQualityRatingComponentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AffectedOrderQualityRatingComponentType fromValue(String value) {
        for (AffectedOrderQualityRatingComponentType b : AffectedOrderQualityRatingComponentType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



