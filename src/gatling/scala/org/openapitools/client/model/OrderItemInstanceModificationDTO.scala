
package org.openapitools.client.model


case class OrderItemInstanceModificationDTO (
    /* Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  */
    _id: Long,
    /* Список кодов маркировки единиц товара.  */
    _instances: List[BriefOrderItemInstanceDTO]
)
object OrderItemInstanceModificationDTO {
    def toStringBody(var_id: Object, var_instances: Object) =
        s"""
        | {
        | "id":$var_id,"instances":$var_instances
        | }
        """.stripMargin
}
