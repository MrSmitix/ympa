package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PartnerShipmentWarehouseDTO {
    /* Идентификатор склада отправления. */
    Long id
    /* Наименование склада отправления. */
    String name
    /* Адрес склада отправления. */
    String address
}
