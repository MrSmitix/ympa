package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Идентификаторы отзывов.
  * @param feedbackIds Список идентификаторов отзывов, на которые магазин не будет отвечать.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SkipGoodsFeedbackReactionRequest(
  feedbackIds: Set[Long]
)

object SkipGoodsFeedbackReactionRequest {
  implicit lazy val skipGoodsFeedbackReactionRequestJsonFormat: Format[SkipGoodsFeedbackReactionRequest] = Json.format[SkipGoodsFeedbackReactionRequest]
}

