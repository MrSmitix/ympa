package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignSettingsDeliveryDTO;
import org.openapitools.model.CampaignSettingsScheduleSourceType;
import org.openapitools.model.RegionType;

@Canonical
class CampaignSettingsLocalRegionDTO {
    /* Идентификатор региона. */
    Long id
    /* Название региона. */
    String name
    
    RegionType type
    
    CampaignSettingsScheduleSourceType deliveryOptionsSource
    
    CampaignSettingsDeliveryDTO delivery
}
