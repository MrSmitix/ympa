
package org.openapitools.client.model


case class OrderStateDTO (
    /* Идентификатор заказа. */
    _id: Long,
    _status: OrderStatusType,
    _substatus: Option[OrderSubstatusType]
)
object OrderStateDTO {
    def toStringBody(var_id: Object, var_status: Object, var_substatus: Object) =
        s"""
        | {
        | "id":$var_id,"status":$var_status,"substatus":$var_substatus
        | }
        """.stripMargin
}
