package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderPaymentMethodType {

    CASH_ON_DELIVERY("CASH_ON_DELIVERY"),
    
    CARD_ON_DELIVERY("CARD_ON_DELIVERY"),
    
    BOUND_CARD_ON_DELIVERY("BOUND_CARD_ON_DELIVERY"),
    
    YANDEX("YANDEX"),
    
    APPLE_PAY("APPLE_PAY"),
    
    EXTERNAL_CERTIFICATE("EXTERNAL_CERTIFICATE"),
    
    CREDIT("CREDIT"),
    
    GOOGLE_PAY("GOOGLE_PAY"),
    
    TINKOFF_CREDIT("TINKOFF_CREDIT"),
    
    SBP("SBP"),
    
    TINKOFF_INSTALLMENTS("TINKOFF_INSTALLMENTS"),
    
    B2_B_ACCOUNT_PREPAYMENT("B2B_ACCOUNT_PREPAYMENT"),
    
    B2_B_ACCOUNT_POSTPAYMENT("B2B_ACCOUNT_POSTPAYMENT"),
    
    UNKNOWN("UNKNOWN")

    private final String value

    OrderPaymentMethodType(String value) {
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
