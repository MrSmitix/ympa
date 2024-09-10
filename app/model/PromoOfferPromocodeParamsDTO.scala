package model

import play.api.libs.json._

/**
  * Параметры товара в акции с типом `MARKET_PROMOCODE`.
  * @param maxPrice Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PromoOfferPromocodeParamsDTO(
  maxPrice: Long
)

object PromoOfferPromocodeParamsDTO {
  implicit lazy val promoOfferPromocodeParamsDTOJsonFormat: Format[PromoOfferPromocodeParamsDTO] = Json.format[PromoOfferPromocodeParamsDTO]
}

