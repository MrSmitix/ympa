package model

import play.api.libs.json._

/**
  * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PromoOfferParamsDTO(
  discountParams: Option[PromoOfferDiscountParamsDTO],
  promocodeParams: Option[PromoOfferPromocodeParamsDTO]
)

object PromoOfferParamsDTO {
  implicit lazy val promoOfferParamsDTOJsonFormat: Format[PromoOfferParamsDTO] = Json.format[PromoOfferParamsDTO]
}

