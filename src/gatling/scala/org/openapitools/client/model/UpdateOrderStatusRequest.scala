
package org.openapitools.client.model


case class UpdateOrderStatusRequest (
    _order: OrderStatusChangeDTO
)
object UpdateOrderStatusRequest {
    def toStringBody(var_order: Object) =
        s"""
        | {
        | "order":$var_order
        | }
        """.stripMargin
}
