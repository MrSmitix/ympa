package model

import play.api.libs.json._

/**
  * Статус товара в магазине.
  * @param campaignId Идентификатор кампании. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferCampaignStatusDTO(
  campaignId: Long,
  status: OfferCampaignStatusType
)

object OfferCampaignStatusDTO {
  implicit lazy val offerCampaignStatusDTOJsonFormat: Format[OfferCampaignStatusDTO] = Json.format[OfferCampaignStatusDTO]
}

