package model

import play.api.libs.json._

/**
  * Фильтр запроса комментариев отзыва. 
  * @param feedbackId Идентификатор отзыва. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetGoodsFeedbackCommentsRequest(
  feedbackId: Long
)

object GetGoodsFeedbackCommentsRequest {
  implicit lazy val getGoodsFeedbackCommentsRequestJsonFormat: Format[GetGoodsFeedbackCommentsRequest] = Json.format[GetGoodsFeedbackCommentsRequest]
}

