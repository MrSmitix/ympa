package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GetOfferMappingDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class GetOfferMappingsResultDTO {
    
    ScrollingPagerDTO paging
    /* Информация о товарах. */
    List<GetOfferMappingDTO> offerMappings = new ArrayList<>()
}
