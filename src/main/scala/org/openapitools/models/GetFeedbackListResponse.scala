package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.FeedbackListDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetFeedbackListResponse(status: Option[ApiResponseStatusType],
                result: Option[FeedbackListDTO]
                )

object GetFeedbackListResponse {
    /**
     * Creates the codec for converting GetFeedbackListResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetFeedbackListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetFeedbackListResponse] = deriveEncoder
}
