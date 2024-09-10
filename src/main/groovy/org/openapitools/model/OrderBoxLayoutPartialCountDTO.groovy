package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OrderBoxLayoutPartialCountDTO {
    /* Номер части, начиная с 1. */
    Integer current
    /* На сколько всего частей разделен товар. */
    Integer total
}
