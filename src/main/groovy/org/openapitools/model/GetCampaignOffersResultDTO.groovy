package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GetCampaignOfferDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class GetCampaignOffersResultDTO {
    
    ScrollingPagerDTO paging
    /* Страница списка товаров. */
    List<GetCampaignOfferDTO> offers = new ArrayList<>()
}
