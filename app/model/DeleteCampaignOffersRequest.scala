package model

import play.api.libs.json._

/**
  * Фильтрации удаляемых товаров по offerIds. 
  * @param offerIds Идентификаторы товаров в каталоге.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteCampaignOffersRequest(
  offerIds: List[String]
)

object DeleteCampaignOffersRequest {
  implicit lazy val deleteCampaignOffersRequestJsonFormat: Format[DeleteCampaignOffersRequest] = Json.format[DeleteCampaignOffersRequest]
}

