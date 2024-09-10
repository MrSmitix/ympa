package model

import play.api.libs.json._

/**
  * Информация о магазине.
  * @param domain URL магазина.
  * @param id Идентификатор кампании.
  * @param clientId Идентификатор плательщика в Яндекс Балансе.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignDTO(
  domain: Option[String],
  id: Option[Long],
  clientId: Option[Long],
  business: Option[BusinessDTO],
  placementType: Option[PlacementType]
)

object CampaignDTO {
  implicit lazy val campaignDTOJsonFormat: Format[CampaignDTO] = Json.format[CampaignDTO]
}

