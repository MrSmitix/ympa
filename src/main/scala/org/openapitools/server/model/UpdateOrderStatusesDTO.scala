package org.openapitools.server.model


/**
 * Список заказов, статус которых обновился.
 *
 * @param orders Список с обновленными заказами. for example: ''null''
*/
final case class UpdateOrderStatusesDTO (
  orders: Seq[UpdateOrderStatusDTO]
)

