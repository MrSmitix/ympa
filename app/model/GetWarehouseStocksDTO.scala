package model

import play.api.libs.json._

/**
  * Список складов с информацией об остатках на каждом из них.
  * @param warehouses Страница списка складов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetWarehouseStocksDTO(
  paging: Option[ScrollingPagerDTO],
  warehouses: List[WarehouseOffersDTO]
)

object GetWarehouseStocksDTO {
  implicit lazy val getWarehouseStocksDTOJsonFormat: Format[GetWarehouseStocksDTO] = Json.format[GetWarehouseStocksDTO]
}

