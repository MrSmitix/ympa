
package org.openapitools.client.model


case class UpdateOrderStatusDTO (
    /* Идентификатор заказа. */
    _id: Option[Long],
    _status: Option[OrderStatusType],
    _substatus: Option[OrderSubstatusType],
    _updateStatus: Option[OrderUpdateStatusType],
    /* Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  */
    _errorDetails: Option[String]
)
object UpdateOrderStatusDTO {
    def toStringBody(var_id: Object, var_status: Object, var_substatus: Object, var_updateStatus: Object, var_errorDetails: Object) =
        s"""
        | {
        | "id":$var_id,"status":$var_status,"substatus":$var_substatus,"updateStatus":$var_updateStatus,"errorDetails":$var_errorDetails
        | }
        """.stripMargin
}
