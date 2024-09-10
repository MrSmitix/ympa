package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum RejectedPromoOfferUpdateReasonType {

    OFFER_DOES_NOT_EXIST("OFFER_DOES_NOT_EXIST"),
    
    OFFER_DUPLICATION("OFFER_DUPLICATION"),
    
    OFFER_NOT_ELIGIBLE_FOR_PROMO("OFFER_NOT_ELIGIBLE_FOR_PROMO"),
    
    OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED("OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED"),
    
    DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED("DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED"),
    
    EMPTY_OLD_PRICE("EMPTY_OLD_PRICE"),
    
    EMPTY_PROMO_PRICE("EMPTY_PROMO_PRICE"),
    
    MAX_PROMO_PRICE_EXCEEDED("MAX_PROMO_PRICE_EXCEEDED"),
    
    PROMO_PRICE_BIGGER_THAN_MAX("PROMO_PRICE_BIGGER_THAN_MAX"),
    
    PROMO_PRICE_SMALLER_THAN_MIN("PROMO_PRICE_SMALLER_THAN_MIN")

    private final String value

    RejectedPromoOfferUpdateReasonType(String value) {
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
