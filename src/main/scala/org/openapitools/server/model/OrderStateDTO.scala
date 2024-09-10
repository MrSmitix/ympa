package org.openapitools.server.model


/**
 * Информация по заказу.
 *
 * @param id Идентификатор заказа. for example: ''null''
 * @param status  for example: ''null''
 * @param substatus  for example: ''null''
*/
final case class OrderStateDTO (
  id: Long,
  status: OrderStatusType,
  substatus: Option[OrderSubstatusType] = None
)

