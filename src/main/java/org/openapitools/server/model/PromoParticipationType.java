package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 */

public enum PromoParticipationType {

    PARTICIPATING_NOW("PARTICIPATING_NOW"),
    PARTICIPATED("PARTICIPATED");

    private String value;

    PromoParticipationType(String value) {
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
    public static PromoParticipationType fromValue(String text) {
        for (PromoParticipationType b : PromoParticipationType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

