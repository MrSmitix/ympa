package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GenerateStocksOnWarehousesReportRequest._

case class GenerateStocksOnWarehousesReportRequest (
  /* Идентификатор магазина. */
  campaignId: Long,
/* Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). */
  warehouseIds: Option[List[Long]],
/* Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. */
  reportDate: Option[LocalDate],
/* Фильтр по категориям на Маркете (кроме модели FBY). */
  categoryIds: Option[List[Long]],
/* Фильтр по наличию остатков (кроме модели FBY). */
  hasStocks: Option[Boolean])

object GenerateStocksOnWarehousesReportRequest {
  import DateTimeCodecs._

  implicit val GenerateStocksOnWarehousesReportRequestCodecJson: CodecJson[GenerateStocksOnWarehousesReportRequest] = CodecJson.derive[GenerateStocksOnWarehousesReportRequest]
  implicit val GenerateStocksOnWarehousesReportRequestDecoder: EntityDecoder[GenerateStocksOnWarehousesReportRequest] = jsonOf[GenerateStocksOnWarehousesReportRequest]
  implicit val GenerateStocksOnWarehousesReportRequestEncoder: EntityEncoder[GenerateStocksOnWarehousesReportRequest] = jsonEncoderOf[GenerateStocksOnWarehousesReportRequest]
}
