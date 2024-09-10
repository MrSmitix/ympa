package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MappingsOfferDTO;
import org.openapitools.model.OfferMappingDTO;

@Canonical
class OfferMappingEntryDTO {
    
    OfferMappingDTO mapping
    
    OfferMappingDTO awaitingModerationMapping
    
    OfferMappingDTO rejectedMapping
    
    MappingsOfferDTO offer
}
