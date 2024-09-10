package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.FeedbackCommentAuthorDTO
import scala.collection.immutable.Seq

/**
 * Комментарий к отзыву на магазин.
 * @param id Идентификатор ответа.
 * @param parentId Идентификатор родительского ответа.
 * @param body Текст ответа.
 * @param createdAt Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param updatedAt Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param author 
 * @param children Дочерние ответы.
 */
case class FeedbackCommentDTO(id: Option[Long],
                parentId: Option[Long],
                body: Option[String],
                createdAt: Option[ZonedDateTime],
                updatedAt: Option[ZonedDateTime],
                author: Option[FeedbackCommentAuthorDTO],
                children: Option[Seq[FeedbackCommentDTO]]
                )

object FeedbackCommentDTO {
    /**
     * Creates the codec for converting FeedbackCommentDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackCommentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackCommentDTO] = deriveEncoder
}
