package model

import play.api.libs.json._

/**
  * Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ShipmentPalletLabelPageFormatType(
)

object ShipmentPalletLabelPageFormatType {
  implicit lazy val shipmentPalletLabelPageFormatTypeJsonFormat: Format[ShipmentPalletLabelPageFormatType] = Json.format[ShipmentPalletLabelPageFormatType]
}

