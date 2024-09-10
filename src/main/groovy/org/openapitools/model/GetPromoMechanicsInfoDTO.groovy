package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GetPromoPromocodeInfoDTO;
import org.openapitools.model.MechanicsType;

@Canonical
class GetPromoMechanicsInfoDTO {
    
    MechanicsType type
    
    GetPromoPromocodeInfoDTO promocodeInfo
}
