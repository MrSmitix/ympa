package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ModelPriceDTO;

@Canonical
class ModelDTO {
    /* Идентификатор модели товара. */
    Long id
    /* Название модели товара. */
    String name
    
    ModelPriceDTO prices
}
