package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ChatMessageSenderType {

    @JsonProperty("PARTNER") PARTNER(String.valueOf("PARTNER")), @JsonProperty("CUSTOMER") CUSTOMER(String.valueOf("CUSTOMER")), @JsonProperty("MARKET") MARKET(String.valueOf("MARKET")), @JsonProperty("SUPPORT") SUPPORT(String.valueOf("SUPPORT"));


    private String value;

    ChatMessageSenderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ChatMessageSenderType fromValue(String value) {
        for (ChatMessageSenderType b : ChatMessageSenderType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



