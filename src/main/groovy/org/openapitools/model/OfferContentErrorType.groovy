package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferContentErrorType {

    OFFER_NOT_FOUND("OFFER_NOT_FOUND"),
    
    UNKNOWN_CATEGORY("UNKNOWN_CATEGORY"),
    
    CATEGORY_MISMATCH("CATEGORY_MISMATCH"),
    
    UNKNOWN_PARAMETER("UNKNOWN_PARAMETER"),
    
    UNEXPECTED_BOOLEAN_VALUE("UNEXPECTED_BOOLEAN_VALUE"),
    
    NUMBER_FORMAT("NUMBER_FORMAT"),
    
    VALUE_BLANK("VALUE_BLANK"),
    
    INVALID_UNIT_ID("INVALID_UNIT_ID"),
    
    INVALID_GROUP_ID_LENGTH("INVALID_GROUP_ID_LENGTH"),
    
    INVALID_GROUP_ID_CHARACTERS("INVALID_GROUP_ID_CHARACTERS")

    private final String value

    OfferContentErrorType(String value) {
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
