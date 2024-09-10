package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PromoOfferPromocodeParamsDTO {
    /* Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.  */
    Long maxPrice
}
