package model

import play.api.libs.json._

/**
  * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
  * @param notDeletedOfferIds Список SKU.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteCampaignOffersDTO(
  notDeletedOfferIds: Option[List[String]]
)

object DeleteCampaignOffersDTO {
  implicit lazy val deleteCampaignOffersDTOJsonFormat: Format[DeleteCampaignOffersDTO] = Json.format[DeleteCampaignOffersDTO]
}

