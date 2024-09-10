package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Фильтр запроса комментариев отзыва. 
 * @param feedbackId Идентификатор отзыва. 
 */
case class GetGoodsFeedbackCommentsRequest(feedbackId: Long
                )

object GetGoodsFeedbackCommentsRequest {
    /**
     * Creates the codec for converting GetGoodsFeedbackCommentsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetGoodsFeedbackCommentsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetGoodsFeedbackCommentsRequest] = deriveEncoder
}
