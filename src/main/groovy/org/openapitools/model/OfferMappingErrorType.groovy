package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferMappingErrorType {

    UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
    
    CATEGORY_MISMATCH("CATEGORY_MISMATCH"),
    
    EMPTY_MARKET_CATEGORY("EMPTY_MARKET_CATEGORY"),
    
    UNKNOWN_PARAMETER("UNKNOWN_PARAMETER"),
    
    UNEXPECTED_BOOLEAN_VALUE("UNEXPECTED_BOOLEAN_VALUE"),
    
    NUMBER_FORMAT("NUMBER_FORMAT"),
    
    VALUE_BLANK("VALUE_BLANK"),
    
    INVALID_UNIT_ID("INVALID_UNIT_ID"),
    
    INVALID_GROUP_ID_LENGTH("INVALID_GROUP_ID_LENGTH"),
    
    INVALID_GROUP_ID_CHARACTERS("INVALID_GROUP_ID_CHARACTERS"),
    
    INVALID_PICKER_URL("INVALID_PICKER_URL")

    private final String value

    OfferMappingErrorType(String value) {
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
