package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OfferRecommendationDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class OfferRecommendationsResultDTO {
    
    ScrollingPagerDTO paging
    /* Страница списка товаров. */
    List<OfferRecommendationDTO> offerRecommendations = new ArrayList<>()
}
