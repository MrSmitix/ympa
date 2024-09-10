package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить. 
 */
case class FeedbackReactionStatusType()

object FeedbackReactionStatusType {
    /**
     * Creates the codec for converting FeedbackReactionStatusType from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackReactionStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackReactionStatusType] = deriveEncoder
}
