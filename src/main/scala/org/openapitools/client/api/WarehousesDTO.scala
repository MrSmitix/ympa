package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WarehousesDTO._

case class WarehousesDTO (
  /* Список складов, не входящих в группы. */
  warehouses: List[WarehouseDTO],
/* Список групп складов. */
  warehouseGroups: List[WarehouseGroupDTO])

object WarehousesDTO {
  import DateTimeCodecs._

  implicit val WarehousesDTOCodecJson: CodecJson[WarehousesDTO] = CodecJson.derive[WarehousesDTO]
  implicit val WarehousesDTODecoder: EntityDecoder[WarehousesDTO] = jsonOf[WarehousesDTO]
  implicit val WarehousesDTOEncoder: EntityEncoder[WarehousesDTO] = jsonEncoderOf[WarehousesDTO]
}
