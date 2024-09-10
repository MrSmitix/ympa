package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PriceSuggestOfferDTO;

@Canonical
class SuggestPricesResultDTO {
    /* Список товаров с ценами для продвижения. */
    List<PriceSuggestOfferDTO> offers = new ArrayList<>()
}
