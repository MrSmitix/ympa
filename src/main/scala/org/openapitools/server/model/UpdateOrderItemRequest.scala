package org.openapitools.server.model


/**
 * Запрос на обновление состава заказа.
 *
 * @param items Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  for example: ''null''
 * @param reason  for example: ''null''
*/
final case class UpdateOrderItemRequest (
  items: Seq[OrderItemModificationDTO],
  reason: Option[OrderItemsModificationRequestReasonType] = None
)

