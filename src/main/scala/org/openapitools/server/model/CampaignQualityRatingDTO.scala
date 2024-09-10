package org.openapitools.server.model


/**
 * Информация об индексе качества магазина.
 *
 * @param campaignId Идентификатор магазина. for example: ''null''
 * @param ratings Список значений индекса качества. for example: ''null''
*/
final case class CampaignQualityRatingDTO (
  campaignId: Long,
  ratings: Seq[QualityRatingDTO]
)

