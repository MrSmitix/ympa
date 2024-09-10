package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.HiddenOfferDTO;

@Canonical
class AddHiddenOffersRequest {
    /* Список скрытых товаров.  */
    List<HiddenOfferDTO> hiddenOffers = new ArrayList<>()
}
