package org.openapitools.server.model


/**
 * Заказ.
 *
 * @param status  for example: ''null''
 * @param substatus  for example: ''null''
 * @param delivery  for example: ''null''
*/
final case class OrderStatusChangeDTO (
  status: OrderStatusType,
  substatus: Option[OrderSubstatusType] = None,
  delivery: Option[OrderStatusChangeDeliveryDTO] = None
)

