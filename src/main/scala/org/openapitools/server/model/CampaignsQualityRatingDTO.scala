package org.openapitools.server.model


/**
 * Информация об индексе качества магазинов.
 *
 * @param campaignRatings Список магазинов c информацией об их индексе качества. for example: ''null''
*/
final case class CampaignsQualityRatingDTO (
  campaignRatings: Seq[CampaignQualityRatingDTO]
)

