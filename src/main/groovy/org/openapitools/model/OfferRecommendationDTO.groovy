package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferForRecommendationDTO;
import org.openapitools.model.OfferRecommendationInfoDTO;

@Canonical
class OfferRecommendationDTO {
    
    OfferForRecommendationDTO offer
    
    OfferRecommendationInfoDTO recommendation
}
