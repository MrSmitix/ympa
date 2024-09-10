package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GoodsFeedbackCommentAuthorDTO
import org.openapitools.models.GoodsFeedbackCommentStatusType

/**
 * Комментарий к отзыву.
 * @param id Идентификатор комментария к отзыву. 
 * @param text Текст комментария.
 * @param canModify Может ли продавец изменять комментарий или удалять его.
 * @param parentId Идентификатор комментария к отзыву. 
 * @param author 
 * @param status 
 */
case class GoodsFeedbackCommentDTO(id: Long,
                text: String,
                canModify: Option[Boolean],
                parentId: Option[Long],
                author: GoodsFeedbackCommentAuthorDTO,
                status: GoodsFeedbackCommentStatusType
                )

object GoodsFeedbackCommentDTO {
    /**
     * Creates the codec for converting GoodsFeedbackCommentDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackCommentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackCommentDTO] = deriveEncoder
}
