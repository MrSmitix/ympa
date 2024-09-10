package model

import play.api.libs.json._

/**
  * Информация о своем регионе магазина.
  * @param id Идентификатор региона.
  * @param name Название региона.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignSettingsLocalRegionDTO(
  id: Option[Long],
  name: Option[String],
  `type`: Option[RegionType],
  deliveryOptionsSource: Option[CampaignSettingsScheduleSourceType],
  delivery: Option[CampaignSettingsDeliveryDTO]
)

object CampaignSettingsLocalRegionDTO {
  implicit lazy val campaignSettingsLocalRegionDTOJsonFormat: Format[CampaignSettingsLocalRegionDTO] = Json.format[CampaignSettingsLocalRegionDTO]
}

