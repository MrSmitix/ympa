package model

import play.api.libs.json._

/**
  * Запрос на установку базовых цен на товары.
  * @param offers Список товаров с ценами.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateBusinessPricesRequest(
  offers: List[UpdateBusinessOfferPriceDTO]
)

object UpdateBusinessPricesRequest {
  implicit lazy val updateBusinessPricesRequestJsonFormat: Format[UpdateBusinessPricesRequest] = Json.format[UpdateBusinessPricesRequest]
}

