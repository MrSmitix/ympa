package org.openapitools.server.model


/**
 * Статус товара в магазине.
 *
 * @param campaignId Идентификатор кампании.  for example: ''null''
 * @param status  for example: ''null''
*/
final case class OfferCampaignStatusDTO (
  campaignId: Long,
  status: OfferCampaignStatusType
)

