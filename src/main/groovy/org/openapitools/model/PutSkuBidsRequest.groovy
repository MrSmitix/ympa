package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.SkuBidItemDTO;

@Canonical
class PutSkuBidsRequest {
    /* Список товаров и ставки для продвижения, которые на них нужно установить. */
    List<SkuBidItemDTO> bids = new ArrayList<>()
}
