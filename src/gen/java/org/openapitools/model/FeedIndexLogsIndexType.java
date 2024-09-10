package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Тип обновления.  Возможные значения:  * &#x60;DIFF&#x60; — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * &#x60;FAST_PRICE&#x60; — только обновление цен ранее опубликованных предложений. * &#x60;FULL&#x60; — полное обновление данных на Яндекс Маркете. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FeedIndexLogsIndexType {

    @JsonProperty("DIFF") DIFF(String.valueOf("DIFF")), @JsonProperty("FAST_PRICE") FAST_PRICE(String.valueOf("FAST_PRICE")), @JsonProperty("FULL") FULL(String.valueOf("FULL"));


    private String value;

    FeedIndexLogsIndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeedIndexLogsIndexType fromValue(String value) {
        for (FeedIndexLogsIndexType b : FeedIndexLogsIndexType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



