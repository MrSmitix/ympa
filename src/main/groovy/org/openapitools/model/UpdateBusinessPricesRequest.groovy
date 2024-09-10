package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateBusinessOfferPriceDTO;

@Canonical
class UpdateBusinessPricesRequest {
    /* Список товаров с ценами. */
    List<UpdateBusinessOfferPriceDTO> offers = new ArrayList<>()
}
