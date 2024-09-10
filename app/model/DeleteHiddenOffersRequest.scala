package model

import play.api.libs.json._

/**
  * Запрос на возобновление показа оферов.
  * @param hiddenOffers Список скрытых товаров. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteHiddenOffersRequest(
  hiddenOffers: List[HiddenOfferDTO]
)

object DeleteHiddenOffersRequest {
  implicit lazy val deleteHiddenOffersRequestJsonFormat: Format[DeleteHiddenOffersRequest] = Json.format[DeleteHiddenOffersRequest]
}

