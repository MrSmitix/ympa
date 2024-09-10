package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetChatsInfoDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetChatsResponse(status: Option[ApiResponseStatusType],
                result: Option[GetChatsInfoDTO]
                )

object GetChatsResponse {
    /**
     * Creates the codec for converting GetChatsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetChatsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetChatsResponse] = deriveEncoder
}
