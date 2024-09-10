package org.openapitools.server.model


/**
 * Запрос на передачу количества упаковок в отгрузке.
 *
 * @param placesCount Количество упаковок в отгрузке. for example: ''null''
*/
final case class SetShipmentPalletsCountRequest (
  placesCount: Int
)

