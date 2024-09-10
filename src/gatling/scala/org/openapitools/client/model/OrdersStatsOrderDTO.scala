
package org.openapitools.client.model

import java.time.LocalDate
import java.time.OffsetDateTime

case class OrdersStatsOrderDTO (
    /* Идентификатор заказа. */
    _id: Option[Long],
    /* Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  */
    _creationDate: Option[LocalDate],
    /* Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  */
    _statusUpdateDate: Option[OffsetDateTime],
    _status: Option[OrderStatsStatusType],
    /* Идентификатор заказа в информационной системе магазина. */
    _partnerOrderId: Option[String],
    _paymentType: Option[OrdersStatsOrderPaymentType],
    /* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
    _fake: Option[Boolean],
    _deliveryRegion: Option[OrdersStatsDeliveryRegionDTO],
    /* Список товаров в заказе после возможных изменений. */
    _items: List[OrdersStatsItemDTO],
    /* Список товаров в заказе до изменений. */
    _initialItems: Option[List[OrdersStatsItemDTO]],
    /* Информация о денежных переводах по заказу. */
    _payments: List[OrdersStatsPaymentDTO],
    /* Информация о комиссиях за заказ. */
    _commissions: List[OrdersStatsCommissionDTO]
)
object OrdersStatsOrderDTO {
    def toStringBody(var_id: Object, var_creationDate: Object, var_statusUpdateDate: Object, var_status: Object, var_partnerOrderId: Object, var_paymentType: Object, var_fake: Object, var_deliveryRegion: Object, var_items: Object, var_initialItems: Object, var_payments: Object, var_commissions: Object) =
        s"""
        | {
        | "id":$var_id,"creationDate":$var_creationDate,"statusUpdateDate":$var_statusUpdateDate,"status":$var_status,"partnerOrderId":$var_partnerOrderId,"paymentType":$var_paymentType,"fake":$var_fake,"deliveryRegion":$var_deliveryRegion,"items":$var_items,"initialItems":$var_initialItems,"payments":$var_payments,"commissions":$var_commissions
        | }
        """.stripMargin
}
