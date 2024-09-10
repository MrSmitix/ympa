package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.QuarantineOfferDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class GetQuarantineOffersResultDTO {
    
    ScrollingPagerDTO paging
    /* Страница списка товаров в карантине. */
    List<QuarantineOfferDTO> offers = new ArrayList<>()
}
