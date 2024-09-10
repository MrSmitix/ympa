package model

import play.api.libs.json._

/**
  * Найденные предложения магазина.
  * @param offers Список предложений магазина.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OffersDTO(
  offers: List[OfferDTO]
)

object OffersDTO {
  implicit lazy val offersDTOJsonFormat: Format[OffersDTO] = Json.format[OffersDTO]
}

