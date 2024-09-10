package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferProcessingNoteType {

    ASSORTMENT("ASSORTMENT"),
    
    CANCELLED("CANCELLED"),
    
    CONFLICTING_INFORMATION("CONFLICTING_INFORMATION"),
    
    OTHER("OTHER"),
    
    DEPARTMENT_FROZEN("DEPARTMENT_FROZEN"),
    
    INCORRECT_INFORMATION("INCORRECT_INFORMATION"),
    
    LEGAL_CONFLICT("LEGAL_CONFLICT"),
    
    NEED_CLASSIFICATION_INFORMATION("NEED_CLASSIFICATION_INFORMATION"),
    
    NEED_INFORMATION("NEED_INFORMATION"),
    
    NEED_PICTURES("NEED_PICTURES"),
    
    NEED_VENDOR("NEED_VENDOR"),
    
    NO_CATEGORY("NO_CATEGORY"),
    
    NO_KNOWLEDGE("NO_KNOWLEDGE"),
    
    NO_PARAMETERS_IN_SHOP_TITLE("NO_PARAMETERS_IN_SHOP_TITLE"),
    
    NO_SIZE_MEASURE("NO_SIZE_MEASURE"),
    
    SAMPLE_LINE("SAMPLE_LINE")

    private final String value

    OfferProcessingNoteType(String value) {
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
