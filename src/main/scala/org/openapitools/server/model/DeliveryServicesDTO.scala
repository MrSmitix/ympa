package org.openapitools.server.model


/**
 * Информация о службах доставки.
 *
 * @param deliveryService Информация о службе доставки. for example: ''null''
*/
final case class DeliveryServicesDTO (
  deliveryService: Seq[DeliveryServiceInfoDTO]
)

