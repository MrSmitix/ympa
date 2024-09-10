package model

import play.api.libs.json._

/**
  * Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackDeliveryType(
)

object FeedbackDeliveryType {
  implicit lazy val feedbackDeliveryTypeJsonFormat: Format[FeedbackDeliveryType] = Json.format[FeedbackDeliveryType]
}

