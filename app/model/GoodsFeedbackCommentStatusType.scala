package model

import play.api.libs.json._

/**
  * Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackCommentStatusType(
)

object GoodsFeedbackCommentStatusType {
  implicit lazy val goodsFeedbackCommentStatusTypeJsonFormat: Format[GoodsFeedbackCommentStatusType] = Json.format[GoodsFeedbackCommentStatusType]
}

