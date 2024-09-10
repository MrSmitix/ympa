package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DeliveryServiceInfoDTO {
    /* Идентификатор службы доставки. */
    Long id
    /* Наименование службы доставки. */
    String name
}
