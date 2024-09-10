package org.openapitools.server.model


/**
 * Список товаров с рекомендациями.
 *
 * @param paging  for example: ''null''
 * @param offerRecommendations Страница списка товаров. for example: ''null''
*/
final case class OfferRecommendationsResultDTO (
  paging: Option[ScrollingPagerDTO] = None,
  offerRecommendations: Seq[OfferRecommendationDTO]
)

