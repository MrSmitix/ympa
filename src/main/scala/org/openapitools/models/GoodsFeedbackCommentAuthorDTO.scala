package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GoodsFeedbackCommentAuthorType

/**
 * Информация об авторе комментария.
 * @param _type 
 * @param name Имя автора или название кабинета.
 */
case class GoodsFeedbackCommentAuthorDTO(_type: Option[GoodsFeedbackCommentAuthorType],
                name: Option[String]
                )

object GoodsFeedbackCommentAuthorDTO {
    /**
     * Creates the codec for converting GoodsFeedbackCommentAuthorDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackCommentAuthorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackCommentAuthorDTO] = deriveEncoder
}
