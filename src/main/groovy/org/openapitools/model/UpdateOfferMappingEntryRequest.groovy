package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateOfferMappingEntryDTO;

@Canonical
class UpdateOfferMappingEntryRequest {
    /* Информация о товарах в каталоге. */
    List<UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>()
}
