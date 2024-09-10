package model

import play.api.libs.json._

/**
  * Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class RejectedPromoOfferDeleteReasonType(
)

object RejectedPromoOfferDeleteReasonType {
  implicit lazy val rejectedPromoOfferDeleteReasonTypeJsonFormat: Format[RejectedPromoOfferDeleteReasonType] = Json.format[RejectedPromoOfferDeleteReasonType]
}

