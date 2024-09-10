package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdateGoodsFeedbackCommentDTO

/**
 * Комментарий к отзыву.
 * @param feedbackId Идентификатор отзыва. 
 * @param comment 
 */
case class UpdateGoodsFeedbackCommentRequest(feedbackId: Long,
                comment: UpdateGoodsFeedbackCommentDTO
                )

object UpdateGoodsFeedbackCommentRequest {
    /**
     * Creates the codec for converting UpdateGoodsFeedbackCommentRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateGoodsFeedbackCommentRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateGoodsFeedbackCommentRequest] = deriveEncoder
}
