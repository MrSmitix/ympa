
package org.openapitools.client.model


case class GetOrderResponse (
    _order: Option[OrderDTO]
)
object GetOrderResponse {
    def toStringBody(var_order: Object) =
        s"""
        | {
        | "order":$var_order
        | }
        """.stripMargin
}
