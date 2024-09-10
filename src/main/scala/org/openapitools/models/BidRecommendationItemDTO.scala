package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Рекомендованная ставка и возможная доля показов.
 * @param bid Значение ставки.
 * @param showPercent Доля показов. 
 */
case class BidRecommendationItemDTO(bid: Int,
                showPercent: Long
                )

object BidRecommendationItemDTO {
    /**
     * Creates the codec for converting BidRecommendationItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[BidRecommendationItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[BidRecommendationItemDTO] = deriveEncoder
}
