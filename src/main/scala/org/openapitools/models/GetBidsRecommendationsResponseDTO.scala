package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.SkuBidRecommendationItemDTO
import scala.collection.immutable.Seq

/**
 * Список товаров с рекомендованными ставками.
 * @param recommendations Список товаров с рекомендованными ставками.
 */
case class GetBidsRecommendationsResponseDTO(recommendations: Seq[SkuBidRecommendationItemDTO]
                )

object GetBidsRecommendationsResponseDTO {
    /**
     * Creates the codec for converting GetBidsRecommendationsResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetBidsRecommendationsResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBidsRecommendationsResponseDTO] = deriveEncoder
}
