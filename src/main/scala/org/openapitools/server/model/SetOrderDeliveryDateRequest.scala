package org.openapitools.server.model


/**
 * @param dates  for example: ''null''
 * @param reason  for example: ''null''
*/
final case class SetOrderDeliveryDateRequest (
  dates: OrderDeliveryDateDTO,
  reason: OrderDeliveryDateReasonType
)

