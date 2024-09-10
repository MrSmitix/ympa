package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ShipmentStatusType;

@Canonical
class SearchShipmentsRequest {
    /* Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  */
    Date dateFrom
    /* Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  */
    Date dateTo
    /* Список статусов отгрузок. */
    Set<ShipmentStatusType> statuses
    /* Список идентификаторов заказов из отгрузок. */
    Set<Long> orderIds
    /* Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  */
    Boolean cancelledOrders = true
}
