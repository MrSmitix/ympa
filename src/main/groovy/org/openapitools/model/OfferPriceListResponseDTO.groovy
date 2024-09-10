package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OfferPriceResponseDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class OfferPriceListResponseDTO {
    /* Страница списка. */
    List<OfferPriceResponseDTO> offers = new ArrayList<>()
    
    ScrollingPagerDTO paging
    /* Количество всех цен магазина, измененных через API. */
    Integer total
}
