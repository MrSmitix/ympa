package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PromoOfferUpdateWarningCodeType {

    DEEP_DISCOUNT_OFFER("DEEP_DISCOUNT_OFFER"),
    
    CATALOG_PRICE_IS_LOWER_THAN_PROMO("CATALOG_PRICE_IS_LOWER_THAN_PROMO"),
    
    SHOP_PRICES_ARE_LOWER_THAN_PROMO("SHOP_PRICES_ARE_LOWER_THAN_PROMO"),
    
    PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE("PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE"),
    
    SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO("SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO")

    private final String value

    PromoOfferUpdateWarningCodeType(String value) {
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
