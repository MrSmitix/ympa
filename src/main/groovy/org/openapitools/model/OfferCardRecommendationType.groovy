package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OfferCardRecommendationType {

    HAS_VIDEO("HAS_VIDEO"),
    
    RECOGNIZED_VENDOR("RECOGNIZED_VENDOR"),
    
    MAIN("MAIN"),
    
    ADDITIONAL("ADDITIONAL"),
    
    DISTINCTIVE("DISTINCTIVE"),
    
    FILTERABLE("FILTERABLE"),
    
    PICTURE_COUNT("PICTURE_COUNT"),
    
    HAS_DESCRIPTION("HAS_DESCRIPTION"),
    
    HAS_BARCODE("HAS_BARCODE"),
    
    FIRST_PICTURE_SIZE("FIRST_PICTURE_SIZE"),
    
    TITLE_LENGTH("TITLE_LENGTH"),
    
    DESCRIPTION_LENGTH("DESCRIPTION_LENGTH"),
    
    AVERAGE_PICTURE_SIZE("AVERAGE_PICTURE_SIZE"),
    
    FIRST_VIDEO_SIZE("FIRST_VIDEO_SIZE"),
    
    FIRST_VIDEO_LENGTH("FIRST_VIDEO_LENGTH"),
    
    AVERAGE_VIDEO_SIZE("AVERAGE_VIDEO_SIZE"),
    
    VIDEO_COUNT("VIDEO_COUNT")

    private final String value

    OfferCardRecommendationType(String value) {
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
