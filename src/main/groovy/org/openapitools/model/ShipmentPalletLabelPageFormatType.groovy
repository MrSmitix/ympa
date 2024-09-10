package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ShipmentPalletLabelPageFormatType {

    A4("A4"),
    
    A8("A8")

    private final String value

    ShipmentPalletLabelPageFormatType(String value) {
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
