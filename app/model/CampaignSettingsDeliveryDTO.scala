package model

import play.api.libs.json._

/**
  * Информация о доставке в своем регионе магазина.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignSettingsDeliveryDTO(
  schedule: Option[CampaignSettingsScheduleDTO]
)

object CampaignSettingsDeliveryDTO {
  implicit lazy val campaignSettingsDeliveryDTOJsonFormat: Format[CampaignSettingsDeliveryDTO] = Json.format[CampaignSettingsDeliveryDTO]
}

