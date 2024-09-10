package model

import play.api.libs.json._

/**
  * Информация об авторе комментария.
  * @param name Имя автора или название кабинета.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackCommentAuthorDTO(
  `type`: Option[GoodsFeedbackCommentAuthorType],
  name: Option[String]
)

object GoodsFeedbackCommentAuthorDTO {
  implicit lazy val goodsFeedbackCommentAuthorDTOJsonFormat: Format[GoodsFeedbackCommentAuthorDTO] = Json.format[GoodsFeedbackCommentAuthorDTO]
}

