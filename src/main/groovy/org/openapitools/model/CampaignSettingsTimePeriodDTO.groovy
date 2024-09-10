package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CampaignSettingsTimePeriodDTO {
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    String fromDate
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    String toDate
}
