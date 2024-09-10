package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferMappingDTO;
import org.openapitools.model.UpdateMappingsOfferDTO;

@Canonical
class UpdateOfferMappingEntryDTO {
    
    OfferMappingDTO mapping
    
    OfferMappingDTO awaitingModerationMapping
    
    OfferMappingDTO rejectedMapping
    
    UpdateMappingsOfferDTO offer
}
