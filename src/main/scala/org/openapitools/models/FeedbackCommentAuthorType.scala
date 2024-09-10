package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
 */
case class FeedbackCommentAuthorType()

object FeedbackCommentAuthorType {
    /**
     * Creates the codec for converting FeedbackCommentAuthorType from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackCommentAuthorType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackCommentAuthorType] = deriveEncoder
}
