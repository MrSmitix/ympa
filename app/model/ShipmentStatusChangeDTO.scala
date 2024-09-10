package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Статус отгрузки.
  * @param description Описание статуса отгрузки.
  * @param updateTime Время последнего изменения статуса отгрузки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ShipmentStatusChangeDTO(
  status: Option[ShipmentStatusType],
  description: Option[String],
  updateTime: Option[OffsetDateTime]
)

object ShipmentStatusChangeDTO {
  implicit lazy val shipmentStatusChangeDTOJsonFormat: Format[ShipmentStatusChangeDTO] = Json.format[ShipmentStatusChangeDTO]
}

