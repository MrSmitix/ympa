package model

import play.api.libs.json._

/**
  * Информация об остатках товара.
  * @param count Значение остатков.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class WarehouseStockDTO(
  `type`: WarehouseStockType,
  count: Long
)

object WarehouseStockDTO {
  implicit lazy val warehouseStockDTOJsonFormat: Format[WarehouseStockDTO] = Json.format[WarehouseStockDTO]
}

