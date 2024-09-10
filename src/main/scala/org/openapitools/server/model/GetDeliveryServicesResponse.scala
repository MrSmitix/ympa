package org.openapitools.server.model


/**
 * Ответ на запрос списка служб доставки.
 *
 * @param result  for example: ''null''
*/
final case class GetDeliveryServicesResponse (
  result: Option[DeliveryServicesDTO] = None
)

