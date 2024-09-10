package model

import play.api.libs.json._

/**
  * Ответ на запрос настроек магазина.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCampaignSettingsResponse(
  settings: Option[CampaignSettingsDTO]
)

object GetCampaignSettingsResponse {
  implicit lazy val getCampaignSettingsResponseJsonFormat: Format[GetCampaignSettingsResponse] = Json.format[GetCampaignSettingsResponse]
}

