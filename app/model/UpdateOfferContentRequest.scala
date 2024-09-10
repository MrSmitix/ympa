package model

import play.api.libs.json._

/**
  * Запрос на установку новых значений для параметров.
  * @param offersContent Список товаров с указанными характеристиками.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOfferContentRequest(
  offersContent: List[OfferContentDTO]
)

object UpdateOfferContentRequest {
  implicit lazy val updateOfferContentRequestJsonFormat: Format[UpdateOfferContentRequest] = Json.format[UpdateOfferContentRequest]
}

