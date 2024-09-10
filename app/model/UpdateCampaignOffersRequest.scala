package model

import play.api.libs.json._

/**
  * Запрос на обновление предложений товаров магазина.
  * @param offers Параметры размещения товаров в заданном магазине.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateCampaignOffersRequest(
  offers: List[UpdateCampaignOfferDTO]
)

object UpdateCampaignOffersRequest {
  implicit lazy val updateCampaignOffersRequestJsonFormat: Format[UpdateCampaignOffersRequest] = Json.format[UpdateCampaignOffersRequest]
}

