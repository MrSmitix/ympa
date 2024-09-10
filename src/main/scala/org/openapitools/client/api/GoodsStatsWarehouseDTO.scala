package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsStatsWarehouseDTO._

case class GoodsStatsWarehouseDTO (
  /* Идентификатор склада. */
  id: Option[Long],
/* Название склада. */
  name: Option[String],
/* Информация об остатках товаров на складе. */
  stocks: List[WarehouseStockDTO])

object GoodsStatsWarehouseDTO {
  import DateTimeCodecs._

  implicit val GoodsStatsWarehouseDTOCodecJson: CodecJson[GoodsStatsWarehouseDTO] = CodecJson.derive[GoodsStatsWarehouseDTO]
  implicit val GoodsStatsWarehouseDTODecoder: EntityDecoder[GoodsStatsWarehouseDTO] = jsonOf[GoodsStatsWarehouseDTO]
  implicit val GoodsStatsWarehouseDTOEncoder: EntityEncoder[GoodsStatsWarehouseDTO] = jsonEncoderOf[GoodsStatsWarehouseDTO]
}
