package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.GetOfferDTO;

@Canonical
class GetOfferMappingDTO {
    
    GetOfferDTO offer
    
    GetMappingDTO mapping
}
