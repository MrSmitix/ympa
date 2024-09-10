package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OrderBoxLayoutDTO;

@Canonical
class SetOrderBoxLayoutRequest {
    /* Список коробок. */
    List<OrderBoxLayoutDTO> boxes = new ArrayList<>()
    /* Передайте `true`, если вы собираетесь удалить часть товаров из заказа. */
    Boolean allowRemove = false
}
