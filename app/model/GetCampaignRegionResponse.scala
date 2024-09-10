package model

import play.api.libs.json._

/**
  * Ответ на запрос региона магазина.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCampaignRegionResponse(
  region: Option[RegionDTO]
)

object GetCampaignRegionResponse {
  implicit lazy val getCampaignRegionResponseJsonFormat: Format[GetCampaignRegionResponse] = Json.format[GetCampaignRegionResponse]
}

