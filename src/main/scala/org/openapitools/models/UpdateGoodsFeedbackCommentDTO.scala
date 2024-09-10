package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Комментарий к отзыву или другому комментарию.
 * @param id Идентификатор комментария к отзыву. 
 * @param parentId Идентификатор комментария к отзыву. 
 * @param text Текст комментария.
 */
case class UpdateGoodsFeedbackCommentDTO(id: Option[Long],
                parentId: Option[Long],
                text: String
                )

object UpdateGoodsFeedbackCommentDTO {
    /**
     * Creates the codec for converting UpdateGoodsFeedbackCommentDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdateGoodsFeedbackCommentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateGoodsFeedbackCommentDTO] = deriveEncoder
}
