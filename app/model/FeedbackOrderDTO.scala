package model

import play.api.libs.json._

/**
  * Информация о заказе, указанная в отзыве.
  * @param shopOrderId Номер заказа, указанный в отзыве.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackOrderDTO(
  shopOrderId: Option[String],
  delivery: Option[FeedbackDeliveryType]
)

object FeedbackOrderDTO {
  implicit lazy val feedbackOrderDTOJsonFormat: Format[FeedbackOrderDTO] = Json.format[FeedbackOrderDTO]
}

