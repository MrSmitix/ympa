package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OfferMappingEntryDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class OfferMappingEntriesDTO {
    
    ScrollingPagerDTO paging
    /* Информация о товарах в каталоге. */
    List<OfferMappingEntryDTO> offerMappingEntries = new ArrayList<>()
}
