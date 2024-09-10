package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferCardStatusType {

    HAS_CARD_CAN_NOT_UPDATE("HAS_CARD_CAN_NOT_UPDATE"),
    
    HAS_CARD_CAN_UPDATE("HAS_CARD_CAN_UPDATE"),
    
    HAS_CARD_CAN_UPDATE_ERRORS("HAS_CARD_CAN_UPDATE_ERRORS"),
    
    HAS_CARD_CAN_UPDATE_PROCESSING("HAS_CARD_CAN_UPDATE_PROCESSING"),
    
    NO_CARD_NEED_CONTENT("NO_CARD_NEED_CONTENT"),
    
    NO_CARD_MARKET_WILL_CREATE("NO_CARD_MARKET_WILL_CREATE"),
    
    NO_CARD_ERRORS("NO_CARD_ERRORS"),
    
    NO_CARD_PROCESSING("NO_CARD_PROCESSING"),
    
    NO_CARD_ADD_TO_CAMPAIGN("NO_CARD_ADD_TO_CAMPAIGN")

    private final String value

    OfferCardStatusType(String value) {
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
