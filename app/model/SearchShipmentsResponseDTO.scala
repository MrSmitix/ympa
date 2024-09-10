package model

import play.api.libs.json._

/**
  * Информация об отгрузках.
  * @param shipments Список с информацией об отгрузках.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SearchShipmentsResponseDTO(
  shipments: List[ShipmentInfoDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object SearchShipmentsResponseDTO {
  implicit lazy val searchShipmentsResponseDTOJsonFormat: Format[SearchShipmentsResponseDTO] = Json.format[SearchShipmentsResponseDTO]
}

