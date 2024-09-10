
package org.openapitools.client.model


case class OrderItemModificationDTO (
    /* Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  */
    _id: Long,
    /* Новое количество товара. */
    _count: Integer,
    /* Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  */
    _instances: Option[List[BriefOrderItemInstanceDTO]]
)
object OrderItemModificationDTO {
    def toStringBody(var_id: Object, var_count: Object, var_instances: Object) =
        s"""
        | {
        | "id":$var_id,"count":$var_count,"instances":$var_instances
        | }
        """.stripMargin
}
