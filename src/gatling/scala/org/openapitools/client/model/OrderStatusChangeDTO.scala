
package org.openapitools.client.model


case class OrderStatusChangeDTO (
    _status: OrderStatusType,
    _substatus: Option[OrderSubstatusType],
    _delivery: Option[OrderStatusChangeDeliveryDTO]
)
object OrderStatusChangeDTO {
    def toStringBody(var_status: Object, var_substatus: Object, var_delivery: Object) =
        s"""
        | {
        | "status":$var_status,"substatus":$var_substatus,"delivery":$var_delivery
        | }
        """.stripMargin
}
