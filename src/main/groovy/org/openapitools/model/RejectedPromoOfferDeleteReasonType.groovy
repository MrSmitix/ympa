package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum RejectedPromoOfferDeleteReasonType {

    OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST")

    private final String value

    RejectedPromoOfferDeleteReasonType(String value) {
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
