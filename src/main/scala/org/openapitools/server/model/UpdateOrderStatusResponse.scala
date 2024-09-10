package org.openapitools.server.model


/**
 * Информация об изменении статуса заказа.
 *
 * @param order  for example: ''null''
*/
final case class UpdateOrderStatusResponse (
  order: Option[OrderDTO] = None
)

