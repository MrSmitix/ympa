package org.openapitools.server.model


/**
 * Информация о магазине к данным идентификатора кампании.
 *
 * @param campaign  for example: ''null''
*/
final case class GetCampaignResponse (
  campaign: Option[CampaignDTO] = None
)

