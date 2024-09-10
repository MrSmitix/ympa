package model

import play.api.libs.json._

/**
  * Список товаров в карантине.
  * @param offers Страница списка товаров в карантине.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetQuarantineOffersResultDTO(
  paging: Option[ScrollingPagerDTO],
  offers: List[QuarantineOfferDTO]
)

object GetQuarantineOffersResultDTO {
  implicit lazy val getQuarantineOffersResultDTOJsonFormat: Format[GetQuarantineOffersResultDTO] = Json.format[GetQuarantineOffersResultDTO]
}

