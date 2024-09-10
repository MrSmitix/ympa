package model

import play.api.libs.json._

/**
  * Ответ на запрос списка логинов, связанных с магазином.
  * @param logins Список логинов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCampaignLoginsResponse(
  logins: List[String]
)

object GetCampaignLoginsResponse {
  implicit lazy val getCampaignLoginsResponseJsonFormat: Format[GetCampaignLoginsResponse] = Json.format[GetCampaignLoginsResponse]
}

