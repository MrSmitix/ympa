
package org.openapitools.client.model

import java.time.LocalDate

case class OrdersStatsDetailsDTO (
    _itemStatus: Option[OrdersStatsItemStatusType],
    /* Количество товара со статусом, указанном в параметре `itemStatus`. */
    _itemCount: Option[Long],
    /* Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  */
    _updateDate: Option[LocalDate],
    _stockType: Option[OrdersStatsStockType]
)
object OrdersStatsDetailsDTO {
    def toStringBody(var_itemStatus: Object, var_itemCount: Object, var_updateDate: Object, var_stockType: Object) =
        s"""
        | {
        | "itemStatus":$var_itemStatus,"itemCount":$var_itemCount,"updateDate":$var_updateDate,"stockType":$var_stockType
        | }
        """.stripMargin
}
