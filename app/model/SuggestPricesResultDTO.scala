package model

import play.api.libs.json._

/**
  * Результат запроса цен для продвижения.
  * @param offers Список товаров с ценами для продвижения.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SuggestPricesResultDTO(
  offers: List[PriceSuggestOfferDTO]
)

object SuggestPricesResultDTO {
  implicit lazy val suggestPricesResultDTOJsonFormat: Format[SuggestPricesResultDTO] = Json.format[SuggestPricesResultDTO]
}

