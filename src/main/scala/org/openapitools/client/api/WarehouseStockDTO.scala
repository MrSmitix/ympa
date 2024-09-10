package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WarehouseStockDTO._

case class WarehouseStockDTO (
  `type`: WarehouseStockType,
/* Значение остатков. */
  count: Long)

object WarehouseStockDTO {
  import DateTimeCodecs._

  implicit val WarehouseStockDTOCodecJson: CodecJson[WarehouseStockDTO] = CodecJson.derive[WarehouseStockDTO]
  implicit val WarehouseStockDTODecoder: EntityDecoder[WarehouseStockDTO] = jsonOf[WarehouseStockDTO]
  implicit val WarehouseStockDTOEncoder: EntityEncoder[WarehouseStockDTO] = jsonEncoderOf[WarehouseStockDTO]
}
