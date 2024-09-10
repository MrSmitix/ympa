package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ChatMessageSenderType {

    PARTNER("PARTNER"),
    
    CUSTOMER("CUSTOMER"),
    
    MARKET("MARKET"),
    
    SUPPORT("SUPPORT")

    private final String value

    ChatMessageSenderType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
