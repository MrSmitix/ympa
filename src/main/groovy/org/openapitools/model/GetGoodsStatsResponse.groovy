package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.GoodsStatsDTO;

@Canonical
class GetGoodsStatsResponse {
    
    ApiResponseStatusType status
    
    GoodsStatsDTO result
}
