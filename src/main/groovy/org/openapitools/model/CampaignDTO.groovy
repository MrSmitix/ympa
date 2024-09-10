package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessDTO;
import org.openapitools.model.PlacementType;

@Canonical
class CampaignDTO {
    /* URL магазина. */
    String domain
    /* Идентификатор кампании. */
    Long id
    /* Идентификатор плательщика в Яндекс Балансе. */
    Long clientId
    
    BusinessDTO business
    
    PlacementType placementType
}
