package model

import play.api.libs.json._

/**
  * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
  * @param name Имя автора отзыва.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackAuthorDTO(
  name: Option[String],
  region: Option[RegionDTO]
)

object FeedbackAuthorDTO {
  implicit lazy val feedbackAuthorDTOJsonFormat: Format[FeedbackAuthorDTO] = Json.format[FeedbackAuthorDTO]
}

