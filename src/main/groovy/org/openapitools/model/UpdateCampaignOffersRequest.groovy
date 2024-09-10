package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateCampaignOfferDTO;

@Canonical
class UpdateCampaignOffersRequest {
    /* Параметры размещения товаров в заданном магазине. */
    List<UpdateCampaignOfferDTO> offers = new ArrayList<>()
}
