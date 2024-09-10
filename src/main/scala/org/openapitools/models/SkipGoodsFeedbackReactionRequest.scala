package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Идентификаторы отзывов.
 * @param feedbackIds Список идентификаторов отзывов, на которые магазин не будет отвечать.
 */
case class SkipGoodsFeedbackReactionRequest(feedbackIds: Set[Long]
                )

object SkipGoodsFeedbackReactionRequest {
    /**
     * Creates the codec for converting SkipGoodsFeedbackReactionRequest from and to JSON.
     */
    implicit val decoder: Decoder[SkipGoodsFeedbackReactionRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SkipGoodsFeedbackReactionRequest] = deriveEncoder
}
