package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
 */
case class GoodsFeedbackCommentAuthorType()

object GoodsFeedbackCommentAuthorType {
    /**
     * Creates the codec for converting GoodsFeedbackCommentAuthorType from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackCommentAuthorType] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackCommentAuthorType] = deriveEncoder
}
