package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.FullOutletDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class GetOutletsResponse {
    /* Информация о точках продаж. */
    List<FullOutletDTO> outlets = new ArrayList<>()
    
    ScrollingPagerDTO paging
    
    FlippingPagerDTO pager
}
