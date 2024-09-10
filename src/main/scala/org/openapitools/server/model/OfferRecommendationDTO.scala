package org.openapitools.server.model


/**
 * Информация о состоянии цен и рекомендации. 
 *
 * @param offer  for example: ''null''
 * @param recommendation  for example: ''null''
*/
final case class OfferRecommendationDTO (
  offer: Option[OfferForRecommendationDTO] = None,
  recommendation: Option[OfferRecommendationInfoDTO] = None
)

