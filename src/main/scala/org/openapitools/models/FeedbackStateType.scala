package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
 */
case class FeedbackStateType()

object FeedbackStateType {
    /**
     * Creates the codec for converting FeedbackStateType from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackStateType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackStateType] = deriveEncoder
}
