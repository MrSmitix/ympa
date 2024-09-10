
package org.openapitools.client.model

import java.time.LocalDate

case class GetOrdersStatsRequest (
    /* Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  */
    _dateFrom: Option[LocalDate],
    /* Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  */
    _dateTo: Option[LocalDate],
    /* Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  */
    _updateFrom: Option[LocalDate],
    /* Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  */
    _updateTo: Option[LocalDate],
    /* Список идентификаторов заказов. */
    _orders: Option[List[Long]],
    /* Список статусов заказов. */
    _statuses: Option[List[OrderStatsStatusType]],
    /* Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  */
    _hasCis: Option[Boolean]
)
object GetOrdersStatsRequest {
    def toStringBody(var_dateFrom: Object, var_dateTo: Object, var_updateFrom: Object, var_updateTo: Object, var_orders: Object, var_statuses: Object, var_hasCis: Object) =
        s"""
        | {
        | "dateFrom":$var_dateFrom,"dateTo":$var_dateTo,"updateFrom":$var_updateFrom,"updateTo":$var_updateTo,"orders":$var_orders,"statuses":$var_statuses,"hasCis":$var_hasCis
        | }
        """.stripMargin
}
