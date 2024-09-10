package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
 */

public enum AffectedOrderQualityRatingComponentType {

    DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),
    DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),
    FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),
    FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE");

    private String value;

    AffectedOrderQualityRatingComponentType(String value) {
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
    public static AffectedOrderQualityRatingComponentType fromValue(String text) {
        for (AffectedOrderQualityRatingComponentType b : AffectedOrderQualityRatingComponentType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

