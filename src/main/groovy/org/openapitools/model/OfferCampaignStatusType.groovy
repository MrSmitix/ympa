package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferCampaignStatusType {

    PUBLISHED("PUBLISHED"),
    
    CHECKING("CHECKING"),
    
    DISABLED_BY_PARTNER("DISABLED_BY_PARTNER"),
    
    DISABLED_AUTOMATICALLY("DISABLED_AUTOMATICALLY"),
    
    REJECTED_BY_MARKET("REJECTED_BY_MARKET"),
    
    CREATING_CARD("CREATING_CARD"),
    
    NO_CARD("NO_CARD"),
    
    NO_STOCKS("NO_STOCKS"),
    
    ARCHIVED("ARCHIVED")

    private final String value

    OfferCampaignStatusType(String value) {
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
