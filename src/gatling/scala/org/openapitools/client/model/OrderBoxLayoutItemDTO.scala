
package org.openapitools.client.model


case class OrderBoxLayoutItemDTO (
    /* Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}    */
    _id: Long,
    /* Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.  */
    _fullCount: Option[Integer],
    _partialCount: Option[OrderBoxLayoutPartialCountDTO],
    /* Переданные вами коды маркировки. */
    _instances: Option[List[BriefOrderItemInstanceDTO]]
)
object OrderBoxLayoutItemDTO {
    def toStringBody(var_id: Object, var_fullCount: Object, var_partialCount: Object, var_instances: Object) =
        s"""
        | {
        | "id":$var_id,"fullCount":$var_fullCount,"partialCount":$var_partialCount,"instances":$var_instances
        | }
        """.stripMargin
}
