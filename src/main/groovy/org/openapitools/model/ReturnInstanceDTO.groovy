package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ReturnInstanceStatusType;
import org.openapitools.model.ReturnInstanceStockType;

@Canonical
class ReturnInstanceDTO {
    
    ReturnInstanceStockType stockType
    
    ReturnInstanceStatusType status
    /* Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). */
    String cis
    /* Международный идентификатор мобильного оборудования. */
    String imei
}
