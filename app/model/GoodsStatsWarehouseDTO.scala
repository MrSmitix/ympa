package model

import play.api.libs.json._

/**
  * Информация о складе.
  * @param id Идентификатор склада.
  * @param name Название склада.
  * @param stocks Информация об остатках товаров на складе.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsStatsWarehouseDTO(
  id: Option[Long],
  name: Option[String],
  stocks: List[WarehouseStockDTO]
)

object GoodsStatsWarehouseDTO {
  implicit lazy val goodsStatsWarehouseDTOJsonFormat: Format[GoodsStatsWarehouseDTO] = Json.format[GoodsStatsWarehouseDTO]
}

