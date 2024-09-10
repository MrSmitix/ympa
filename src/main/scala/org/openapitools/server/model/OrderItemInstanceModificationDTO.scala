package org.openapitools.server.model


/**
 * Позиция в корзине, требующая маркировки.
 *
 * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  for example: ''null''
 * @param instances Список кодов маркировки единиц товара.  for example: ''null''
*/
final case class OrderItemInstanceModificationDTO (
  id: Long,
  instances: Seq[BriefOrderItemInstanceDTO]
)

