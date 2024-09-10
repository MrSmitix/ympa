
package org.openapitools.client.model

import java.time.OffsetDateTime

case class ReturnDTO (
    /* Идентификатор возврата. */
    _id: Option[Long],
    /* Номер заказа. */
    _orderId: Option[Long],
    /* Дата создания возврата клиентом. */
    _creationDate: Option[OffsetDateTime],
    /* Дата обновления возврата. */
    _updateDate: Option[OffsetDateTime],
    _refundStatus: Option[RefundStatusType],
    _logisticPickupPoint: Option[LogisticPickupPointDTO],
    _shipmentRecipientType: Option[RecipientType],
    _shipmentStatus: Option[ReturnShipmentStatusType],
    /* Сумма возврата. */
    _refundAmount: Option[Long],
    /* Список товаров в возврате. */
    _items: List[ReturnItemDTO],
    _returnType: Option[ReturnType],
    /* Используется ли опция **Быстрый возврат денег за дешевый брак**.  */
    _fastReturn: Option[Boolean]
)
object ReturnDTO {
    def toStringBody(var_id: Object, var_orderId: Object, var_creationDate: Object, var_updateDate: Object, var_refundStatus: Object, var_logisticPickupPoint: Object, var_shipmentRecipientType: Object, var_shipmentStatus: Object, var_refundAmount: Object, var_items: Object, var_returnType: Object, var_fastReturn: Object) =
        s"""
        | {
        | "id":$var_id,"orderId":$var_orderId,"creationDate":$var_creationDate,"updateDate":$var_updateDate,"refundStatus":$var_refundStatus,"logisticPickupPoint":$var_logisticPickupPoint,"shipmentRecipientType":$var_shipmentRecipientType,"shipmentStatus":$var_shipmentStatus,"refundAmount":$var_refundAmount,"items":$var_items,"returnType":$var_returnType,"fastReturn":$var_fastReturn
        | }
        """.stripMargin
}
