package org.openapitools.server.model


/**
 * Ответ на запрос настроек кабинета.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetBusinessSettingsResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[GetBusinessSettingsInfoDTO] = None
)

