package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MaxSaleQuantumDTO {
    /* Идентификатор категории. */
    Long id
    /* Название категории. */
    String name
    /* Лимит на установку кванта и минимального количества товаров. */
    Integer maxSaleQuantum
}
