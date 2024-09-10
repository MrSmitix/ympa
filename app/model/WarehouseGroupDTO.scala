package model

import play.api.libs.json._

/**
  * Информация о группе складов.
  * @param name Название группы складов.
  * @param warehouses Список складов, входящих в группу.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class WarehouseGroupDTO(
  name: String,
  mainWarehouse: WarehouseDTO,
  warehouses: List[WarehouseDTO]
)

object WarehouseGroupDTO {
  implicit lazy val warehouseGroupDTOJsonFormat: Format[WarehouseGroupDTO] = Json.format[WarehouseGroupDTO]
}

