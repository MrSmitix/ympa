package org.openapitools.server.model


/**
 * Ответ на запрос настроек магазина.
 *
 * @param settings  for example: ''null''
*/
final case class GetCampaignSettingsResponse (
  settings: Option[CampaignSettingsDTO] = None
)

