package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.ReturnDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetReturnResponse(status: Option[ApiResponseStatusType],
                result: Option[ReturnDTO]
                )

object GetReturnResponse {
    /**
     * Creates the codec for converting GetReturnResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetReturnResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetReturnResponse] = deriveEncoder
}
