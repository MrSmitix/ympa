package org.openapitools.server.model


/**
 * Информация о грузоместе.
 *
 * @param id Идентификатор грузоместа. for example: ''null''
 * @param fulfilmentId Идентификатор грузового места в информационной системе магазина. for example: ''null''
*/
final case class OrderParcelBoxDTO (
  id: Option[Long] = None,
  fulfilmentId: Option[String] = None
)

