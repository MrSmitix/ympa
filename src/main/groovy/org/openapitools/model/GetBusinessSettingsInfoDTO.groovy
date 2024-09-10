package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessDTO;
import org.openapitools.model.BusinessSettingsDTO;

@Canonical
class GetBusinessSettingsInfoDTO {
    
    BusinessDTO info
    
    BusinessSettingsDTO settings
}
