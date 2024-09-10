package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferCampaignStatusType;

@Canonical
class OfferCampaignStatusDTO {
    /* Идентификатор кампании.  */
    Long campaignId
    
    OfferCampaignStatusType status
}
