package model

import play.api.libs.json._

/**
  * Информация о магазине к данным идентификатора кампании.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCampaignResponse(
  campaign: Option[CampaignDTO]
)

object GetCampaignResponse {
  implicit lazy val getCampaignResponseJsonFormat: Format[GetCampaignResponse] = Json.format[GetCampaignResponse]
}

