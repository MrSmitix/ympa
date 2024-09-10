package model

import play.api.libs.json._

/**
  * Фильтр запроса отзывов по бизнесу. 
  * @param id Идентификатор комментария к отзыву. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteGoodsFeedbackCommentRequest(
  id: Long
)

object DeleteGoodsFeedbackCommentRequest {
  implicit lazy val deleteGoodsFeedbackCommentRequestJsonFormat: Format[DeleteGoodsFeedbackCommentRequest] = Json.format[DeleteGoodsFeedbackCommentRequest]
}

