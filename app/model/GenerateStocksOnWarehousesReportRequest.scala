package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Данные, необходимые для генерации отчета. 
  * @param campaignId Идентификатор магазина.
  * @param warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
  * @param reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
  * @param categoryIds Фильтр по категориям на Маркете (кроме модели FBY).
  * @param hasStocks Фильтр по наличию остатков (кроме модели FBY).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateStocksOnWarehousesReportRequest(
  campaignId: Long,
  warehouseIds: Option[List[Long]],
  reportDate: Option[LocalDate],
  categoryIds: Option[List[Long]],
  hasStocks: Option[Boolean]
)

object GenerateStocksOnWarehousesReportRequest {
  implicit lazy val generateStocksOnWarehousesReportRequestJsonFormat: Format[GenerateStocksOnWarehousesReportRequest] = Json.format[GenerateStocksOnWarehousesReportRequest]
}

