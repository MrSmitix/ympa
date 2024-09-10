package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AddOffersToArchiveDTO;
import org.openapitools.model.ApiResponseStatusType;

@Canonical
class AddOffersToArchiveResponse {
    
    ApiResponseStatusType status
    
    AddOffersToArchiveDTO result
}
