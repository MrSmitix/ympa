package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.QualityRatingDTO;

@Canonical
class CampaignQualityRatingDTO {
    /* Идентификатор магазина. */
    Long campaignId
    /* Список значений индекса качества. */
    List<QualityRatingDTO> ratings = new ArrayList<>()
}
