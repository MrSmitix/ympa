package model

import play.api.libs.json._

/**
  * Запрос для подтверждения отгрузки.
  * @param externalShipmentId Идентификатор отгрузки в системе поставщика.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ConfirmShipmentRequest(
  externalShipmentId: Option[String]
)

object ConfirmShipmentRequest {
  implicit lazy val confirmShipmentRequestJsonFormat: Format[ConfirmShipmentRequest] = Json.format[ConfirmShipmentRequest]
}

