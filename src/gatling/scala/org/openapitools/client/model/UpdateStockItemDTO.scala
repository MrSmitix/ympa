
package org.openapitools.client.model

import java.time.OffsetDateTime

case class UpdateStockItemDTO (
    /* Количество доступного товара.  */
    _count: Long,
    /* Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
    _updatedAt: Option[OffsetDateTime]
)
object UpdateStockItemDTO {
    def toStringBody(var_count: Object, var_updatedAt: Object) =
        s"""
        | {
        | "count":$var_count,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
