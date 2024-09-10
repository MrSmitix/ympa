
package org.openapitools.client.model

import java.time.LocalDate

case class GenerateStocksOnWarehousesReportRequest (
    /* Идентификатор магазина. */
    _campaignId: Long,
    /* Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). */
    _warehouseIds: Option[List[Long]],
    /* Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. */
    _reportDate: Option[LocalDate],
    /* Фильтр по категориям на Маркете (кроме модели FBY). */
    _categoryIds: Option[List[Long]],
    /* Фильтр по наличию остатков (кроме модели FBY). */
    _hasStocks: Option[Boolean]
)
object GenerateStocksOnWarehousesReportRequest {
    def toStringBody(var_campaignId: Object, var_warehouseIds: Object, var_reportDate: Object, var_categoryIds: Object, var_hasStocks: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"warehouseIds":$var_warehouseIds,"reportDate":$var_reportDate,"categoryIds":$var_categoryIds,"hasStocks":$var_hasStocks
        | }
        """.stripMargin
}
