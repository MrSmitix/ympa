package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrdersStatsCommissionType {

    FEE("FEE"),
    
    FULFILLMENT("FULFILLMENT"),
    
    LOYALTY_PARTICIPATION_FEE("LOYALTY_PARTICIPATION_FEE"),
    
    AUCTION_PROMOTION("AUCTION_PROMOTION"),
    
    INSTALLMENT("INSTALLMENT"),
    
    DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),
    
    EXPRESS_DELIVERY_TO_CUSTOMER("EXPRESS_DELIVERY_TO_CUSTOMER"),
    
    AGENCY("AGENCY"),
    
    PAYMENT_TRANSFER("PAYMENT_TRANSFER"),
    
    RETURNED_ORDERS_STORAGE("RETURNED_ORDERS_STORAGE"),
    
    SORTING("SORTING"),
    
    INTAKE_SORTING("INTAKE_SORTING"),
    
    RETURN_PROCESSING("RETURN_PROCESSING"),
    
    ILLIQUID_GOODS_SALE("ILLIQUID_GOODS_SALE")

    private final String value

    OrdersStatsCommissionType(String value) {
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
