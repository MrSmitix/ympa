package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignSettingsScheduleSourceType {

    WEB("WEB"),
    
    YML("YML")

    private final String value

    CampaignSettingsScheduleSourceType(String value) {
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
