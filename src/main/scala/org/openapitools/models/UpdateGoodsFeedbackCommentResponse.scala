package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GoodsFeedbackCommentDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class UpdateGoodsFeedbackCommentResponse(status: Option[ApiResponseStatusType],
                result: Option[GoodsFeedbackCommentDTO]
                )

object UpdateGoodsFeedbackCommentResponse {
    /**
     * Creates the codec for converting UpdateGoodsFeedbackCommentResponse from and to JSON.
     */
    implicit val decoder: Decoder[UpdateGoodsFeedbackCommentResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateGoodsFeedbackCommentResponse] = deriveEncoder
}
