package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_MISMATCH&#x60; — указана категория, которая не совпадает с категорией товара. * &#x60;EMPTY_MARKET_CATEGORY&#x60; — не указана категория Маркета при передаче характеристик категории. * &#x60;UNKNOWN_PARAMETER&#x60; — передана характеристика, которой нет среди характеристик категории. * &#x60;UNEXPECTED_BOOLEAN_VALUE&#x60; — вместо boolean-значения передано что-то другое. * &#x60;NUMBER_FORMAT&#x60; — передана строка, не обозначающая число, вместо числа. * &#x60;VALUE_BLANK&#x60; — передано пустое значение. * &#x60;INVALID_UNIT_ID&#x60; — передана единица измерения, недопустимая для характеристики. * &#x60;INVALID_GROUP_ID_LENGTH&#x60; — в названии превышено допустимое значение символов — 255. * &#x60;INVALID_GROUP_ID_CHARACTERS&#x60; — переданы [недопустимые символы](*ascii-code). * &#x60;INVALID_PICKER_URL&#x60; — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OfferMappingErrorType {

    @JsonProperty("UNKNOWN_CATEGORY") UNKNOWN_CATEGORY(String.valueOf("UNKNOWN_CATEGORY")), @JsonProperty("CATEGORY_MISMATCH") CATEGORY_MISMATCH(String.valueOf("CATEGORY_MISMATCH")), @JsonProperty("EMPTY_MARKET_CATEGORY") EMPTY_MARKET_CATEGORY(String.valueOf("EMPTY_MARKET_CATEGORY")), @JsonProperty("UNKNOWN_PARAMETER") UNKNOWN_PARAMETER(String.valueOf("UNKNOWN_PARAMETER")), @JsonProperty("UNEXPECTED_BOOLEAN_VALUE") UNEXPECTED_BOOLEAN_VALUE(String.valueOf("UNEXPECTED_BOOLEAN_VALUE")), @JsonProperty("NUMBER_FORMAT") NUMBER_FORMAT(String.valueOf("NUMBER_FORMAT")), @JsonProperty("VALUE_BLANK") VALUE_BLANK(String.valueOf("VALUE_BLANK")), @JsonProperty("INVALID_UNIT_ID") INVALID_UNIT_ID(String.valueOf("INVALID_UNIT_ID")), @JsonProperty("INVALID_GROUP_ID_LENGTH") INVALID_GROUP_ID_LENGTH(String.valueOf("INVALID_GROUP_ID_LENGTH")), @JsonProperty("INVALID_GROUP_ID_CHARACTERS") INVALID_GROUP_ID_CHARACTERS(String.valueOf("INVALID_GROUP_ID_CHARACTERS")), @JsonProperty("INVALID_PICKER_URL") INVALID_PICKER_URL(String.valueOf("INVALID_PICKER_URL"));


    private String value;

    OfferMappingErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfferMappingErrorType fromValue(String value) {
        for (OfferMappingErrorType b : OfferMappingErrorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



