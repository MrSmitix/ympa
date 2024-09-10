package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OrderParcelBoxDTO {
    /* Идентификатор грузоместа. */
    Long id
    /* Идентификатор грузового места в информационной системе магазина. */
    String fulfilmentId
}
