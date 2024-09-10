
package org.openapitools.client.model


case class UpdateOrderItemRequest (
    /* Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  */
    _items: List[OrderItemModificationDTO],
    _reason: Option[OrderItemsModificationRequestReasonType]
)
object UpdateOrderItemRequest {
    def toStringBody(var_items: Object, var_reason: Object) =
        s"""
        | {
        | "items":$var_items,"reason":$var_reason
        | }
        """.stripMargin
}
