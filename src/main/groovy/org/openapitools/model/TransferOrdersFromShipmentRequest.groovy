package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class TransferOrdersFromShipmentRequest {
    /* Список заказов, которые вы не успеваете подготовить. */
    List<Long> orderIds = new ArrayList<>()
}
