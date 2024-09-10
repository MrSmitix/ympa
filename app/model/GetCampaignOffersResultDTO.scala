package model

import play.api.libs.json._

/**
  * Список товаров в заданном магазине.
  * @param offers Страница списка товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCampaignOffersResultDTO(
  paging: Option[ScrollingPagerDTO],
  offers: List[GetCampaignOfferDTO]
)

object GetCampaignOffersResultDTO {
  implicit lazy val getCampaignOffersResultDTOJsonFormat: Format[GetCampaignOffersResultDTO] = Json.format[GetCampaignOffersResultDTO]
}

