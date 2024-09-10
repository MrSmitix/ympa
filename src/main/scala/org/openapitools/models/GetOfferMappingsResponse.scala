package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetOfferMappingsResultDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetOfferMappingsResponse(status: Option[ApiResponseStatusType],
                result: Option[GetOfferMappingsResultDTO]
                )

object GetOfferMappingsResponse {
    /**
     * Creates the codec for converting GetOfferMappingsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferMappingsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferMappingsResponse] = deriveEncoder
}
