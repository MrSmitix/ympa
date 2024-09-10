package model

import play.api.libs.json._

/**
  * Цена на товар.
  * @param value Значение.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class BasePriceDTO(
  value: BigDecimal,
  currencyId: CurrencyType
)

object BasePriceDTO {
  implicit lazy val basePriceDTOJsonFormat: Format[BasePriceDTO] = Json.format[BasePriceDTO]
}

