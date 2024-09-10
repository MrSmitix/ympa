package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.PagedReturnsDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetReturnsResponse(status: Option[ApiResponseStatusType],
                result: Option[PagedReturnsDTO]
                )

object GetReturnsResponse {
    /**
     * Creates the codec for converting GetReturnsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetReturnsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetReturnsResponse] = deriveEncoder
}
