package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetSuggestedOfferMappingsResultDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetSuggestedOfferMappingsResponse(status: Option[ApiResponseStatusType],
                result: Option[GetSuggestedOfferMappingsResultDTO]
                )

object GetSuggestedOfferMappingsResponse {
    /**
     * Creates the codec for converting GetSuggestedOfferMappingsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetSuggestedOfferMappingsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetSuggestedOfferMappingsResponse] = deriveEncoder
}
