package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderItemStatusType;

@Canonical
class OrderItemDetailDTO {
    /* Количество единиц товара. */
    Long itemCount
    
    OrderItemStatusType itemStatus
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    String updateDate
}
