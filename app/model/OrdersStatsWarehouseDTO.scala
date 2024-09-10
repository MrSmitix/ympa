package model

import play.api.libs.json._

/**
  * Информация о складе, на котором хранится товар.
  * @param id Идентификатор склада.
  * @param name Название склада.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsWarehouseDTO(
  id: Option[Long],
  name: Option[String]
)

object OrdersStatsWarehouseDTO {
  implicit lazy val ordersStatsWarehouseDTOJsonFormat: Format[OrdersStatsWarehouseDTO] = Json.format[OrdersStatsWarehouseDTO]
}

