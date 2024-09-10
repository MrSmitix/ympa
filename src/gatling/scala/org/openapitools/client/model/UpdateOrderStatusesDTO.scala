
package org.openapitools.client.model


case class UpdateOrderStatusesDTO (
    /* Список с обновленными заказами. */
    _orders: List[UpdateOrderStatusDTO]
)
object UpdateOrderStatusesDTO {
    def toStringBody(var_orders: Object) =
        s"""
        | {
        | "orders":$var_orders
        | }
        """.stripMargin
}
