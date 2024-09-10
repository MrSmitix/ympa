package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetBidsRecommendationsResponseDTO

/**
 * description.
 * @param status 
 * @param result 
 */
case class GetBidsRecommendationsResponse(status: Option[ApiResponseStatusType],
                result: Option[GetBidsRecommendationsResponseDTO]
                )

object GetBidsRecommendationsResponse {
    /**
     * Creates the codec for converting GetBidsRecommendationsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetBidsRecommendationsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBidsRecommendationsResponse] = deriveEncoder
}
