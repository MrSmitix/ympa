
package org.openapitools.client.model


case class CreateChatRequest (
    /* Идентификатор заказа на Маркете. */
    _orderId: Long
)
object CreateChatRequest {
    def toStringBody(var_orderId: Object) =
        s"""
        | {
        | "orderId":$var_orderId
        | }
        """.stripMargin
}
