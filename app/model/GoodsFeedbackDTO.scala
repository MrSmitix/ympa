package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Отзыв о товаре.
  * @param feedbackId Идентификатор отзыва. 
  * @param createdAt Дата и время создания отзыва.
  * @param needReaction Нужен ли ответ на отзыв.
  * @param author Имя автора отзыва.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackDTO(
  feedbackId: Long,
  createdAt: OffsetDateTime,
  needReaction: Boolean,
  identifiers: GoodsFeedbackIdentifiersDTO,
  author: Option[String],
  description: Option[GoodsFeedbackDescriptionDTO],
  media: Option[GoodsFeedbackMediaDTO],
  statistics: GoodsFeedbackStatisticsDTO
)

object GoodsFeedbackDTO {
  implicit lazy val goodsFeedbackDTOJsonFormat: Format[GoodsFeedbackDTO] = Json.format[GoodsFeedbackDTO]
}

