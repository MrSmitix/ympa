package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferMappingDTO;

@Canonical
class OfferMappingInfoDTO {
    
    OfferMappingDTO mapping
    
    OfferMappingDTO awaitingModerationMapping
    
    OfferMappingDTO rejectedMapping
}
