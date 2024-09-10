package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferSellingProgramStatusType;
import org.openapitools.model.SellingProgramType;

@Canonical
class OfferSellingProgramDTO {
    
    SellingProgramType sellingProgram
    
    OfferSellingProgramStatusType status
}
