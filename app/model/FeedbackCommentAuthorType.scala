package model

import play.api.libs.json._

/**
  * Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackCommentAuthorType(
)

object FeedbackCommentAuthorType {
  implicit lazy val feedbackCommentAuthorTypeJsonFormat: Format[FeedbackCommentAuthorType] = Json.format[FeedbackCommentAuthorType]
}

