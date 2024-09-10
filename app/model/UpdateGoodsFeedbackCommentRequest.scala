package model

import play.api.libs.json._

/**
  * Комментарий к отзыву.
  * @param feedbackId Идентификатор отзыва. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateGoodsFeedbackCommentRequest(
  feedbackId: Long,
  comment: UpdateGoodsFeedbackCommentDTO
)

object UpdateGoodsFeedbackCommentRequest {
  implicit lazy val updateGoodsFeedbackCommentRequestJsonFormat: Format[UpdateGoodsFeedbackCommentRequest] = Json.format[UpdateGoodsFeedbackCommentRequest]
}

