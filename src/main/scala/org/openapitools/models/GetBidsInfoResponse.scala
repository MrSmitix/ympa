package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetBidsInfoResponseDTO

/**
 * description.
 * @param status 
 * @param result 
 */
case class GetBidsInfoResponse(status: Option[ApiResponseStatusType],
                result: Option[GetBidsInfoResponseDTO]
                )

object GetBidsInfoResponse {
    /**
     * Creates the codec for converting GetBidsInfoResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetBidsInfoResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBidsInfoResponse] = deriveEncoder
}
