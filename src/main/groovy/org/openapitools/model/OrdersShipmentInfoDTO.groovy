package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;

@Canonical
class OrdersShipmentInfoDTO {
    /* Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. */
    Set<Long> orderIdsWithLabels = new LinkedHashSet<>()
    /* Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. */
    Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>()
}
