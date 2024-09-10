package model

import play.api.libs.json._

/**
  * Запрос на передачу количества упаковок в отгрузке.
  * @param placesCount Количество упаковок в отгрузке.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SetShipmentPalletsCountRequest(
  placesCount: Int
)

object SetShipmentPalletsCountRequest {
  implicit lazy val setShipmentPalletsCountRequestJsonFormat: Format[SetShipmentPalletsCountRequest] = Json.format[SetShipmentPalletsCountRequest]
}

