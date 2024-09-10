package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsWarehouseDTO._

case class OrdersStatsWarehouseDTO (
  /* Идентификатор склада. */
  id: Option[Long],
/* Название склада. */
  name: Option[String])

object OrdersStatsWarehouseDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsWarehouseDTOCodecJson: CodecJson[OrdersStatsWarehouseDTO] = CodecJson.derive[OrdersStatsWarehouseDTO]
  implicit val OrdersStatsWarehouseDTODecoder: EntityDecoder[OrdersStatsWarehouseDTO] = jsonOf[OrdersStatsWarehouseDTO]
  implicit val OrdersStatsWarehouseDTOEncoder: EntityEncoder[OrdersStatsWarehouseDTO] = jsonEncoderOf[OrdersStatsWarehouseDTO]
}
