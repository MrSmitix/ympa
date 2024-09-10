package model

import play.api.libs.json._

/**
  * Параметры товара, который участвует в акции.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdatePromoOfferParamsDTO(
  discountParams: Option[UpdatePromoOfferDiscountParamsDTO]
)

object UpdatePromoOfferParamsDTO {
  implicit lazy val updatePromoOfferParamsDTOJsonFormat: Format[UpdatePromoOfferParamsDTO] = Json.format[UpdatePromoOfferParamsDTO]
}

