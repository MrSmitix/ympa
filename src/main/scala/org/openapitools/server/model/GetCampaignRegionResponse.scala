package org.openapitools.server.model


/**
 * Ответ на запрос региона магазина.
 *
 * @param region  for example: ''null''
*/
final case class GetCampaignRegionResponse (
  region: Option[RegionDTO] = None
)

