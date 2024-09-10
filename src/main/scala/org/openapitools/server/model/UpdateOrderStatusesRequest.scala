package org.openapitools.server.model


/**
 * Список заказов.
 *
 * @param orders Список заказов. for example: ''null''
*/
final case class UpdateOrderStatusesRequest (
  orders: Seq[OrderStateDTO]
)

