package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип ошибки в содержимом прайс-листа.  Возможные значения:  * &#x60;PARSE_ERROR&#x60; — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * &#x60;PARSE_XML_ERROR&#x60; — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * &#x60;TOO_MANY_REJECTED_OFFERS&#x60; — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FeedContentErrorType {

    @JsonProperty("PARSE_ERROR") PARSE_ERROR(String.valueOf("PARSE_ERROR")), @JsonProperty("PARSE_XML_ERROR") PARSE_XML_ERROR(String.valueOf("PARSE_XML_ERROR")), @JsonProperty("TOO_MANY_REJECTED_OFFERS") TOO_MANY_REJECTED_OFFERS(String.valueOf("TOO_MANY_REJECTED_OFFERS"));


    private String value;

    FeedContentErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeedContentErrorType fromValue(String value) {
        for (FeedContentErrorType b : FeedContentErrorType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



