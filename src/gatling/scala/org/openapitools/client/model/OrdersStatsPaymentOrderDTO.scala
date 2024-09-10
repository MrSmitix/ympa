
package org.openapitools.client.model

import java.time.LocalDate

case class OrdersStatsPaymentOrderDTO (
    /* Номер платежного поручения. */
    _id: Option[String],
    /* Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
    _date: Option[LocalDate]
)
object OrdersStatsPaymentOrderDTO {
    def toStringBody(var_id: Object, var_date: Object) =
        s"""
        | {
        | "id":$var_id,"date":$var_date
        | }
        """.stripMargin
}
