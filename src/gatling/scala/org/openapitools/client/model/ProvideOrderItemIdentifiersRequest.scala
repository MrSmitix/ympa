
package org.openapitools.client.model


case class ProvideOrderItemIdentifiersRequest (
    /* Список позиций, требующих маркировки.  */
    _items: List[OrderItemInstanceModificationDTO]
)
object ProvideOrderItemIdentifiersRequest {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
