package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderVatType {

    NO_VAT("NO_VAT"),
    
    VAT_0("VAT_0"),
    
    VAT_10("VAT_10"),
    
    VAT_10_110("VAT_10_110"),
    
    VAT_20("VAT_20"),
    
    VAT_20_120("VAT_20_120"),
    
    VAT_18("VAT_18"),
    
    VAT_18_118("VAT_18_118"),
    
    UNKNOWN_VALUE("UNKNOWN_VALUE")

    private final String value

    OrderVatType(String value) {
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
