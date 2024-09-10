package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetPromosResultDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetPromosResponse(status: Option[ApiResponseStatusType],
                result: Option[GetPromosResultDTO]
                )

object GetPromosResponse {
    /**
     * Creates the codec for converting GetPromosResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetPromosResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromosResponse] = deriveEncoder
}
