package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WarehouseAddressDTO;

@Canonical
class WarehouseDTO {
    /* Идентификатор склада. */
    Long id
    /* Название склада. */
    String name
    /* Идентификатор кампании в API и идентификатор магазина. */
    Long campaignId
    /* Возможна ли доставка по модели Экспресс. */
    Boolean express
    
    WarehouseAddressDTO address
}
