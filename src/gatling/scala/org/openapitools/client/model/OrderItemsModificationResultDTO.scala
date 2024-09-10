
package org.openapitools.client.model


case class OrderItemsModificationResultDTO (
    /* Список позиций в заказе, подлежащих маркировке. */
    _items: List[BriefOrderItemDTO]
)
object OrderItemsModificationResultDTO {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
