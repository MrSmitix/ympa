package org.openapitools.server.model


/**
 * Информация об отгрузке.
 *
 * @param currentStatus  for example: ''null''
 * @param availableActions Доступные действия над отгрузкой. for example: ''null''
*/
final case class ExtensionShipmentDTO (
  currentStatus: Option[ShipmentStatusChangeDTO] = None,
  availableActions: Set[ShipmentActionType]
)

