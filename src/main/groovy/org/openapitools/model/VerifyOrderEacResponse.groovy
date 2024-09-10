package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.EacVerificationResultDTO;

@Canonical
class VerifyOrderEacResponse {
    
    ApiResponseStatusType status
    
    EacVerificationResultDTO result
}
