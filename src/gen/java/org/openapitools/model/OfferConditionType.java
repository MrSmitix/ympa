package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип уценки:  * &#x60;PREOWNED&#x60; —  бывший в употреблении товар, раньше принадлежал другому человеку. * &#x60;SHOWCASESAMPLE&#x60; — витринный образец. * &#x60;REFURBISHED&#x60; — повторная продажа товара. * &#x60;REDUCTION&#x60; — товар с дефектами. * &#x60;RENOVATED&#x60; — восстановленный товар. * &#x60;NOT_SPECIFIED&#x60; — не выбран.  &#x60;REFURBISHED&#x60; — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OfferConditionType {

    @JsonProperty("PREOWNED") PREOWNED(String.valueOf("PREOWNED")), @JsonProperty("SHOWCASESAMPLE") SHOWCASESAMPLE(String.valueOf("SHOWCASESAMPLE")), @JsonProperty("REFURBISHED") REFURBISHED(String.valueOf("REFURBISHED")), @JsonProperty("REDUCTION") REDUCTION(String.valueOf("REDUCTION")), @JsonProperty("RENOVATED") RENOVATED(String.valueOf("RENOVATED")), @JsonProperty("NOT_SPECIFIED") NOT_SPECIFIED(String.valueOf("NOT_SPECIFIED"));


    private String value;

    OfferConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfferConditionType fromValue(String value) {
        for (OfferConditionType b : OfferConditionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



