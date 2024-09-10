package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedbackCommentAuthorType

/**
 * Информация об авторе комментария.
 * @param _type 
 * @param name Имя автора отзыва или название магазина.
 */
case class FeedbackCommentAuthorDTO(_type: Option[FeedbackCommentAuthorType],
                name: Option[String]
                )

object FeedbackCommentAuthorDTO {
    /**
     * Creates the codec for converting FeedbackCommentAuthorDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackCommentAuthorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackCommentAuthorDTO] = deriveEncoder
}
