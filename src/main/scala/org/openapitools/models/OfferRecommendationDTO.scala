package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferForRecommendationDTO
import org.openapitools.models.OfferRecommendationInfoDTO

/**
 * Информация о состоянии цен и рекомендации. 
 * @param offer 
 * @param recommendation 
 */
case class OfferRecommendationDTO(offer: Option[OfferForRecommendationDTO],
                recommendation: Option[OfferRecommendationInfoDTO]
                )

object OfferRecommendationDTO {
    /**
     * Creates the codec for converting OfferRecommendationDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferRecommendationDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferRecommendationDTO] = deriveEncoder
}
