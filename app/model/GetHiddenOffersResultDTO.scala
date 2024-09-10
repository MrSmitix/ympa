package model

import play.api.libs.json._

/**
  * Список скрытых вами товаров. 
  * @param hiddenOffers Список скрытых товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetHiddenOffersResultDTO(
  paging: Option[ScrollingPagerDTO],
  hiddenOffers: List[HiddenOfferDTO]
)

object GetHiddenOffersResultDTO {
  implicit lazy val getHiddenOffersResultDTOJsonFormat: Format[GetHiddenOffersResultDTO] = Json.format[GetHiddenOffersResultDTO]
}

