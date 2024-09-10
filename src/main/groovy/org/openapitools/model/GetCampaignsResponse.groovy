package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignDTO;
import org.openapitools.model.FlippingPagerDTO;

@Canonical
class GetCampaignsResponse {
    /* Список с информацией по каждому магазину. */
    List<CampaignDTO> campaigns = new ArrayList<>()
    
    FlippingPagerDTO pager
}
