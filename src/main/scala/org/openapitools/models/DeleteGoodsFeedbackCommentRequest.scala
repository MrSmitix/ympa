package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Фильтр запроса отзывов по бизнесу. 
 * @param id Идентификатор комментария к отзыву. 
 */
case class DeleteGoodsFeedbackCommentRequest(id: Long
                )

object DeleteGoodsFeedbackCommentRequest {
    /**
     * Creates the codec for converting DeleteGoodsFeedbackCommentRequest from and to JSON.
     */
    implicit val decoder: Decoder[DeleteGoodsFeedbackCommentRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteGoodsFeedbackCommentRequest] = deriveEncoder
}
