package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус чата:  * &#x60;NEW&#x60; — новый чат. * &#x60;WAITING_FOR_CUSTOMER&#x60; — нужен ответ покупателя. * &#x60;WAITING_FOR_PARTNER&#x60; — нужен ответ магазина. * &#x60;WAITING_FOR_ARBITER&#x60; — нужен ответ арбитра. * &#x60;WAITING_FOR_MARKET&#x60; — нужен ответ Маркета. * &#x60;FINISHED&#x60; — чат завершен. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ChatStatusType {

    @JsonProperty("NEW") NEW(String.valueOf("NEW")), @JsonProperty("WAITING_FOR_CUSTOMER") WAITING_FOR_CUSTOMER(String.valueOf("WAITING_FOR_CUSTOMER")), @JsonProperty("WAITING_FOR_PARTNER") WAITING_FOR_PARTNER(String.valueOf("WAITING_FOR_PARTNER")), @JsonProperty("WAITING_FOR_ARBITER") WAITING_FOR_ARBITER(String.valueOf("WAITING_FOR_ARBITER")), @JsonProperty("WAITING_FOR_MARKET") WAITING_FOR_MARKET(String.valueOf("WAITING_FOR_MARKET")), @JsonProperty("FINISHED") FINISHED(String.valueOf("FINISHED"));


    private String value;

    ChatStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ChatStatusType fromValue(String value) {
        for (ChatStatusType b : ChatStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



