package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ChatType {

    CHAT("CHAT"),
    
    ARBITRAGE("ARBITRAGE")

    private final String value

    ChatType(String value) {
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
