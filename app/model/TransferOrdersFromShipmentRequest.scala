package model

import play.api.libs.json._

/**
  * Запрос переноса заказов из отгрузки.
  * @param orderIds Список заказов, которые вы не успеваете подготовить.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class TransferOrdersFromShipmentRequest(
  orderIds: List[Long]
)

object TransferOrdersFromShipmentRequest {
  implicit lazy val transferOrdersFromShipmentRequestJsonFormat: Format[TransferOrdersFromShipmentRequest] = Json.format[TransferOrdersFromShipmentRequest]
}

