package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PriceDTO;

@Canonical
class OfferPriceResponseDTO {
    /* Идентификатор предложения из прайс-листа. */
    String id
    
    PriceDTO price
    /* SKU на Маркете. */
    Long marketSku
    /* Дата и время последнего обновления цены на товар. */
    Date updatedAt
}
