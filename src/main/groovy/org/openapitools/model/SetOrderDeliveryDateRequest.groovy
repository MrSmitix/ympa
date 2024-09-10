package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderDeliveryDateDTO;
import org.openapitools.model.OrderDeliveryDateReasonType;

@Canonical
class SetOrderDeliveryDateRequest {
    
    OrderDeliveryDateDTO dates
    
    OrderDeliveryDateReasonType reason
}
