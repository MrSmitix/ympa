package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Комментарий к отзыву на магазин.
  * @param id Идентификатор ответа.
  * @param parentId Идентификатор родительского ответа.
  * @param body Текст ответа.
  * @param createdAt Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  * @param updatedAt Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  * @param children Дочерние ответы.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackCommentDTO(
  id: Option[Long],
  parentId: Option[Long],
  body: Option[String],
  createdAt: Option[OffsetDateTime],
  updatedAt: Option[OffsetDateTime],
  author: Option[FeedbackCommentAuthorDTO],
  children: Option[List[FeedbackCommentDTO]]
)

object FeedbackCommentDTO {
  implicit lazy val feedbackCommentDTOJsonFormat: Format[FeedbackCommentDTO] = Json.format[FeedbackCommentDTO]
}

