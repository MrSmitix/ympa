package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderDeliveryDispatchType {

    UNKNOWN("UNKNOWN"),
    
    BUYER("BUYER"),
    
    MARKET_PARTNER_OUTLET("MARKET_PARTNER_OUTLET"),
    
    MARKET_BRANDED_OUTLET("MARKET_BRANDED_OUTLET"),
    
    SHOP_OUTLET("SHOP_OUTLET"),
    
    DROPOFF("DROPOFF")

    private final String value

    OrderDeliveryDispatchType(String value) {
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
