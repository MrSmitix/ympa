
package org.openapitools.client.model

import java.time.LocalDate

case class OrderDeliveryDateDTO (
    /* Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`.  */
    _toDate: LocalDate
)
object OrderDeliveryDateDTO {
    def toStringBody(var_toDate: Object) =
        s"""
        | {
        | "toDate":$var_toDate
        | }
        """.stripMargin
}
