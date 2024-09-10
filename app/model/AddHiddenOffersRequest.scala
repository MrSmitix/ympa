package model

import play.api.libs.json._

/**
  * Запрос на скрытие оферов.
  * @param hiddenOffers Список скрытых товаров. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class AddHiddenOffersRequest(
  hiddenOffers: List[HiddenOfferDTO]
)

object AddHiddenOffersRequest {
  implicit lazy val addHiddenOffersRequestJsonFormat: Format[AddHiddenOffersRequest] = Json.format[AddHiddenOffersRequest]
}

