package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.SkuBidItemDTO;

@Canonical
class GetBidsInfoResponseDTO {
    /* Страница списка товаров. */
    List<SkuBidItemDTO> bids = new ArrayList<>()
    
    ForwardScrollingPagerDTO paging
}
