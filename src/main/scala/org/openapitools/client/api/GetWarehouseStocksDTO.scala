package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetWarehouseStocksDTO._

case class GetWarehouseStocksDTO (
  paging: Option[ScrollingPagerDTO],
/* Страница списка складов. */
  warehouses: List[WarehouseOffersDTO])

object GetWarehouseStocksDTO {
  import DateTimeCodecs._

  implicit val GetWarehouseStocksDTOCodecJson: CodecJson[GetWarehouseStocksDTO] = CodecJson.derive[GetWarehouseStocksDTO]
  implicit val GetWarehouseStocksDTODecoder: EntityDecoder[GetWarehouseStocksDTO] = jsonOf[GetWarehouseStocksDTO]
  implicit val GetWarehouseStocksDTOEncoder: EntityEncoder[GetWarehouseStocksDTO] = jsonEncoderOf[GetWarehouseStocksDTO]
}
