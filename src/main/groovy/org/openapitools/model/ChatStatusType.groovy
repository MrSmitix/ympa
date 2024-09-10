package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ChatStatusType {

    NEW("NEW"),
    
    WAITING_FOR_CUSTOMER("WAITING_FOR_CUSTOMER"),
    
    WAITING_FOR_PARTNER("WAITING_FOR_PARTNER"),
    
    WAITING_FOR_ARBITER("WAITING_FOR_ARBITER"),
    
    WAITING_FOR_MARKET("WAITING_FOR_MARKET"),
    
    FINISHED("FINISHED")

    private final String value

    ChatStatusType(String value) {
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
