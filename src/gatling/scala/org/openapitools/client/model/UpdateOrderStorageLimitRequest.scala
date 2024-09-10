
package org.openapitools.client.model

import java.time.LocalDate

case class UpdateOrderStorageLimitRequest (
    /* Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`.  */
    _newDate: LocalDate
)
object UpdateOrderStorageLimitRequest {
    def toStringBody(var_newDate: Object) =
        s"""
        | {
        | "newDate":$var_newDate
        | }
        """.stripMargin
}
