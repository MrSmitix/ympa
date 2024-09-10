package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.HiddenOfferDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class GetHiddenOffersResultDTO {
    
    ScrollingPagerDTO paging
    /* Список скрытых товаров. */
    List<HiddenOfferDTO> hiddenOffers = new ArrayList<>()
}
