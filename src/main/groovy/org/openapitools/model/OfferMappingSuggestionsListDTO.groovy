package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EnrichedMappingsOfferDTO;

@Canonical
class OfferMappingSuggestionsListDTO {
    /* Список товаров. */
    List<EnrichedMappingsOfferDTO> offers = new ArrayList<>()
}
