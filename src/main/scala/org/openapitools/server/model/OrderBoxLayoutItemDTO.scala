package org.openapitools.server.model


/**
 * Информация о товаре в коробке.
 *
 * @param id Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}    for example: ''null''
 * @param fullCount Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.  for example: ''null''
 * @param partialCount  for example: ''null''
 * @param instances Переданные вами коды маркировки. for example: ''null''
*/
final case class OrderBoxLayoutItemDTO (
  id: Long,
  fullCount: Option[Int] = None,
  partialCount: Option[OrderBoxLayoutPartialCountDTO] = None,
  instances: Option[Seq[BriefOrderItemInstanceDTO]] = None
)

