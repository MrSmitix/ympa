package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WarehouseAddressDTO;

@Canonical
class FulfillmentWarehouseDTO {
    /* Идентификатор склада. */
    Long id
    /* Название склада. */
    String name
    
    WarehouseAddressDTO address
}
