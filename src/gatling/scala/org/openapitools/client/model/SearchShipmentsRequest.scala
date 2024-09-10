
package org.openapitools.client.model

import java.time.LocalDate

case class SearchShipmentsRequest (
    /* Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  */
    _dateFrom: LocalDate,
    /* Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  */
    _dateTo: LocalDate,
    /* Список статусов отгрузок. */
    _statuses: Option[Set[ShipmentStatusType]],
    /* Список идентификаторов заказов из отгрузок. */
    _orderIds: Option[Set[Long]],
    /* Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  */
    _cancelledOrders: Option[Boolean]
)
object SearchShipmentsRequest {
    def toStringBody(var_dateFrom: Object, var_dateTo: Object, var_statuses: Object, var_orderIds: Object, var_cancelledOrders: Object) =
        s"""
        | {
        | "dateFrom":$var_dateFrom,"dateTo":$var_dateTo,"statuses":$var_statuses,"orderIds":$var_orderIds,"cancelledOrders":$var_cancelledOrders
        | }
        """.stripMargin
}
