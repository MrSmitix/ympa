
package org.openapitools.client.model

import java.time.LocalDate

case class OrdersStatsPaymentDTO (
    /* Идентификатор денежного перевода. */
    _id: Option[String],
    /* Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  */
    _date: Option[LocalDate],
    _type: Option[OrdersStatsPaymentType],
    _source: Option[OrdersStatsPaymentSourceType],
    /* Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  */
    _total: Option[Number],
    _paymentOrder: Option[OrdersStatsPaymentOrderDTO]
)
object OrdersStatsPaymentDTO {
    def toStringBody(var_id: Object, var_date: Object, var_type: Object, var_source: Object, var_total: Object, var_paymentOrder: Object) =
        s"""
        | {
        | "id":$var_id,"date":$var_date,"type":$var_type,"source":$var_source,"total":$var_total,"paymentOrder":$var_paymentOrder
        | }
        """.stripMargin
}
