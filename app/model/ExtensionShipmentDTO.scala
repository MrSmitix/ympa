package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Информация об отгрузке.
  * @param availableActions Доступные действия над отгрузкой.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ExtensionShipmentDTO(
  currentStatus: Option[ShipmentStatusChangeDTO],
  availableActions: Set[ShipmentActionType]
)

object ExtensionShipmentDTO {
  implicit lazy val extensionShipmentDTOJsonFormat: Format[ExtensionShipmentDTO] = Json.format[ExtensionShipmentDTO]
}

