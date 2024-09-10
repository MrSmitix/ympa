package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WarehouseStockType._

case class WarehouseStockType (
  
object WarehouseStockType {
  import DateTimeCodecs._

  implicit val WarehouseStockTypeCodecJson: CodecJson[WarehouseStockType] = CodecJson.derive[WarehouseStockType]
  implicit val WarehouseStockTypeDecoder: EntityDecoder[WarehouseStockType] = jsonOf[WarehouseStockType]
  implicit val WarehouseStockTypeEncoder: EntityEncoder[WarehouseStockType] = jsonEncoderOf[WarehouseStockType]
}
