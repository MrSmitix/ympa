package org.openapitools.server.model


/**
 * Информация о доставке.
 *
 * @param dates  for example: ''null''
*/
final case class OrderStatusChangeDeliveryDTO (
  dates: Option[OrderStatusChangeDeliveryDatesDTO] = None
)

