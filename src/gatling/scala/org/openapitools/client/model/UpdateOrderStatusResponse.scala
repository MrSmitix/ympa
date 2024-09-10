
package org.openapitools.client.model


case class UpdateOrderStatusResponse (
    _order: Option[OrderDTO]
)
object UpdateOrderStatusResponse {
    def toStringBody(var_order: Object) =
        s"""
        | {
        | "order":$var_order
        | }
        """.stripMargin
}
