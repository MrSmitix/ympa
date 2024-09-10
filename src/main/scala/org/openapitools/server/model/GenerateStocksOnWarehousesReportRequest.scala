package org.openapitools.server.model

import java.time.LocalDate

/**
 * Данные, необходимые для генерации отчета. 
 *
 * @param campaignId Идентификатор магазина. for example: ''null''
 * @param warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). for example: ''null''
 * @param reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. for example: ''null''
 * @param categoryIds Фильтр по категориям на Маркете (кроме модели FBY). for example: ''null''
 * @param hasStocks Фильтр по наличию остатков (кроме модели FBY). for example: ''null''
*/
final case class GenerateStocksOnWarehousesReportRequest (
  campaignId: Long,
  warehouseIds: Option[Seq[Long]] = None,
  reportDate: Option[LocalDate] = None,
  categoryIds: Option[Seq[Long]] = None,
  hasStocks: Option[Boolean] = None
)

