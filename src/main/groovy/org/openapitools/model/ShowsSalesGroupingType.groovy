package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ShowsSalesGroupingType {

    CATEGORIES("CATEGORIES"),
    
    OFFERS("OFFERS")

    private final String value

    ShowsSalesGroupingType(String value) {
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
