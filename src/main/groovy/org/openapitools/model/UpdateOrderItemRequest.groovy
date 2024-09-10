package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OrderItemModificationDTO;
import org.openapitools.model.OrderItemsModificationRequestReasonType;

@Canonical
class UpdateOrderItemRequest {
    /* Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  */
    List<OrderItemModificationDTO> items = new ArrayList<>()
    
    OrderItemsModificationRequestReasonType reason
}
