package model

import play.api.libs.json._

/**
  * Информация об авторе комментария.
  * @param name Имя автора отзыва или название магазина.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackCommentAuthorDTO(
  `type`: Option[FeedbackCommentAuthorType],
  name: Option[String]
)

object FeedbackCommentAuthorDTO {
  implicit lazy val feedbackCommentAuthorDTOJsonFormat: Format[FeedbackCommentAuthorDTO] = Json.format[FeedbackCommentAuthorDTO]
}

