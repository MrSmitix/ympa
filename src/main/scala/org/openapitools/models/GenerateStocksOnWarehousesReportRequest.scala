package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import scala.collection.immutable.Seq

/**
 * Данные, необходимые для генерации отчета. 
 * @param campaignId Идентификатор магазина.
 * @param warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
 * @param reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
 * @param categoryIds Фильтр по категориям на Маркете (кроме модели FBY).
 * @param hasStocks Фильтр по наличию остатков (кроме модели FBY).
 */
case class GenerateStocksOnWarehousesReportRequest(campaignId: Long,
                warehouseIds: Option[Seq[Long]],
                reportDate: Option[LocalDateTime],
                categoryIds: Option[Seq[Long]],
                hasStocks: Option[Boolean]
                )

object GenerateStocksOnWarehousesReportRequest {
    /**
     * Creates the codec for converting GenerateStocksOnWarehousesReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateStocksOnWarehousesReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateStocksOnWarehousesReportRequest] = deriveEncoder
}
