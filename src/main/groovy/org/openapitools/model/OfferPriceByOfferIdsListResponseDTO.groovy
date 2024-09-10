package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OfferPriceByOfferIdsResponseDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class OfferPriceByOfferIdsListResponseDTO {
    /* Страница списка цен. */
    List<OfferPriceByOfferIdsResponseDTO> offers = new ArrayList<>()
    
    ScrollingPagerDTO paging
}
