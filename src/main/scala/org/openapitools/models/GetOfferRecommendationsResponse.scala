package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OfferRecommendationsResultDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetOfferRecommendationsResponse(status: Option[ApiResponseStatusType],
                result: Option[OfferRecommendationsResultDTO]
                )

object GetOfferRecommendationsResponse {
    /**
     * Creates the codec for converting GetOfferRecommendationsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferRecommendationsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferRecommendationsResponse] = deriveEncoder
}
