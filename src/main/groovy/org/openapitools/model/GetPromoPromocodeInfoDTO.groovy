package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GetPromoPromocodeInfoDTO {
    /* Промокод. */
    String promocode
    /* Процент скидки по промокоду. */
    Integer discount
}
