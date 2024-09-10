package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignQualityRatingDTO;

@Canonical
class CampaignsQualityRatingDTO {
    /* Список магазинов c информацией об их индексе качества. */
    List<CampaignQualityRatingDTO> campaignRatings = new ArrayList<>()
}
