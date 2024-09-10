package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GoodsFeedbackCommentListDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetGoodsFeedbackCommentsResponse(status: Option[ApiResponseStatusType],
                result: Option[GoodsFeedbackCommentListDTO]
                )

object GetGoodsFeedbackCommentsResponse {
    /**
     * Creates the codec for converting GetGoodsFeedbackCommentsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetGoodsFeedbackCommentsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetGoodsFeedbackCommentsResponse] = deriveEncoder
}