package org.openapitools.server.model


/**
 * Информация об индексе качества магазинов.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetQualityRatingResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[CampaignsQualityRatingDTO] = None
)

