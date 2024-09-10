package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
 */

public enum OfferConditionType {

    PREOWNED("PREOWNED"),
    SHOWCASESAMPLE("SHOWCASESAMPLE"),
    REFURBISHED("REFURBISHED"),
    REDUCTION("REDUCTION"),
    RENOVATED("RENOVATED"),
    NOT_SPECIFIED("NOT_SPECIFIED");

    private String value;

    OfferConditionType(String value) {
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
    public static OfferConditionType fromValue(String text) {
        for (OfferConditionType b : OfferConditionType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

