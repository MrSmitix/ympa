package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.RegionDTO;

@Canonical
class GetRegionWithChildrenResponse {
    
    FlippingPagerDTO pager
    
    RegionDTO regions
}
