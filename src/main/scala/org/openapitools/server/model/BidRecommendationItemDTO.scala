package org.openapitools.server.model


/**
 * Рекомендованная ставка и возможная доля показов.
 *
 * @param bid Значение ставки. for example: ''570''
 * @param showPercent Доля показов.  for example: ''null''
*/
final case class BidRecommendationItemDTO (
  bid: Int,
  showPercent: Long
)

