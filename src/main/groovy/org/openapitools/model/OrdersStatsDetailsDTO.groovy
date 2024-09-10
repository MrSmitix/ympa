package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrdersStatsItemStatusType;
import org.openapitools.model.OrdersStatsStockType;

@Canonical
class OrdersStatsDetailsDTO {
    
    OrdersStatsItemStatusType itemStatus
    /* Количество товара со статусом, указанном в параметре `itemStatus`. */
    Long itemCount
    /* Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  */
    Date updateDate
    
    OrdersStatsStockType stockType
}
