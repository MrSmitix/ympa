package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ShipmentStatusType;

@Canonical
class ShipmentStatusChangeDTO {
    
    ShipmentStatusType status
    /* Описание статуса отгрузки. */
    String description
    /* Время последнего изменения статуса отгрузки. */
    Date updateTime
}
