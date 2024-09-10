package org.openapitools.server.model


/**
 * Запрос для подтверждения отгрузки.
 *
 * @param externalShipmentId Идентификатор отгрузки в системе поставщика. for example: ''null''
*/
final case class ConfirmShipmentRequest (
  externalShipmentId: Option[String] = None
)

