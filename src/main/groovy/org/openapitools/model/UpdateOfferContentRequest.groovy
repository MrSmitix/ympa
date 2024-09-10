package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OfferContentDTO;

@Canonical
class UpdateOfferContentRequest {
    /* Список товаров с указанными характеристиками. */
    List<OfferContentDTO> offersContent = new ArrayList<>()
}
