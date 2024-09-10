package org.openapitools.server.model


/**
 * Список товаров с рекомендованными ставками.
 *
 * @param recommendations Список товаров с рекомендованными ставками. for example: ''null''
*/
final case class GetBidsRecommendationsResponseDTO (
  recommendations: Seq[SkuBidRecommendationItemDTO]
)

