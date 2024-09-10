package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderStatusChangeDeliveryDTO;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;

@Canonical
class OrderStatusChangeDTO {
    
    OrderStatusType status
    
    OrderSubstatusType substatus
    
    OrderStatusChangeDeliveryDTO delivery
}
