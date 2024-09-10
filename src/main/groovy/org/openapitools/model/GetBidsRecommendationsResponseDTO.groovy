package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.SkuBidRecommendationItemDTO;

@Canonical
class GetBidsRecommendationsResponseDTO {
    /* Список товаров с рекомендованными ставками. */
    List<SkuBidRecommendationItemDTO> recommendations = new ArrayList<>()
}
