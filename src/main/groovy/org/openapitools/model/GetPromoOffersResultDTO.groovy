package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetPromoOfferDTO;

@Canonical
class GetPromoOffersResultDTO {
    /* Товары, которые участвуют или могут участвовать в акции. */
    List<GetPromoOfferDTO> offers = new ArrayList<>()
    
    ForwardScrollingPagerDTO paging
}
