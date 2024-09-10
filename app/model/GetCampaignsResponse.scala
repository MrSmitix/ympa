package model

import play.api.libs.json._

/**
  * Результаты поиска магазинов.
  * @param campaigns Список с информацией по каждому магазину.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCampaignsResponse(
  campaigns: List[CampaignDTO],
  pager: Option[FlippingPagerDTO]
)

object GetCampaignsResponse {
  implicit lazy val getCampaignsResponseJsonFormat: Format[GetCampaignsResponse] = Json.format[GetCampaignsResponse]
}

