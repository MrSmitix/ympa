package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.OrderUpdateStatusType;

@Canonical
class UpdateOrderStatusDTO {
    /* Идентификатор заказа. */
    Long id
    
    OrderStatusType status
    
    OrderSubstatusType substatus
    
    OrderUpdateStatusType updateStatus
    /* Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  */
    String errorDetails
}
