package model

import play.api.libs.json._

/**
  * Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PriceQuarantineVerdictParamNameType(
)

object PriceQuarantineVerdictParamNameType {
  implicit lazy val priceQuarantineVerdictParamNameTypeJsonFormat: Format[PriceQuarantineVerdictParamNameType] = Json.format[PriceQuarantineVerdictParamNameType]
}

