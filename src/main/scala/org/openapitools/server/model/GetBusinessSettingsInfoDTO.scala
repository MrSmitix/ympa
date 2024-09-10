package org.openapitools.server.model


/**
 * Информация о кабинете и его настройках.
 *
 * @param info  for example: ''null''
 * @param settings  for example: ''null''
*/
final case class GetBusinessSettingsInfoDTO (
  info: Option[BusinessDTO] = None,
  settings: Option[BusinessSettingsDTO] = None
)

