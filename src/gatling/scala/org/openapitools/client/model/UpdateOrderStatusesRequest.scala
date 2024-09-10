
package org.openapitools.client.model


case class UpdateOrderStatusesRequest (
    /* Список заказов. */
    _orders: List[OrderStateDTO]
)
object UpdateOrderStatusesRequest {
    def toStringBody(var_orders: Object) =
        s"""
        | {
        | "orders":$var_orders
        | }
        """.stripMargin
}
