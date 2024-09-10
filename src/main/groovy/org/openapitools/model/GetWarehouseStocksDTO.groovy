package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ScrollingPagerDTO;
import org.openapitools.model.WarehouseOffersDTO;

@Canonical
class GetWarehouseStocksDTO {
    
    ScrollingPagerDTO paging
    /* Страница списка складов. */
    List<WarehouseOffersDTO> warehouses = new ArrayList<>()
}
