package model

import play.api.libs.json._

/**
  * Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackReactionStatusType(
)

object FeedbackReactionStatusType {
  implicit lazy val feedbackReactionStatusTypeJsonFormat: Format[FeedbackReactionStatusType] = Json.format[FeedbackReactionStatusType]
}

