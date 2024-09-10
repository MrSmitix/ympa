package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OrderItemInstanceModificationDTO;

@Canonical
class ProvideOrderItemIdentifiersRequest {
    /* Список позиций, требующих маркировки.  */
    List<OrderItemInstanceModificationDTO> items = new ArrayList<>()
}
