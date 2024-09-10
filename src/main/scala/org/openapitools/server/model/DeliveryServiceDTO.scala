package org.openapitools.server.model


/**
 * Служба доставки.
 *
 * @param id Идентификатор службы доставки. for example: ''null''
 * @param name Наименование службы доставки. for example: ''null''
*/
final case class DeliveryServiceDTO (
  id: Option[Long] = None,
  name: Option[String] = None
)

