package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WarehouseGroupDTO._

case class WarehouseGroupDTO (
  /* Название группы складов. */
  name: String,
mainWarehouse: WarehouseDTO,
/* Список складов, входящих в группу. */
  warehouses: List[WarehouseDTO])

object WarehouseGroupDTO {
  import DateTimeCodecs._

  implicit val WarehouseGroupDTOCodecJson: CodecJson[WarehouseGroupDTO] = CodecJson.derive[WarehouseGroupDTO]
  implicit val WarehouseGroupDTODecoder: EntityDecoder[WarehouseGroupDTO] = jsonOf[WarehouseGroupDTO]
  implicit val WarehouseGroupDTOEncoder: EntityEncoder[WarehouseGroupDTO] = jsonEncoderOf[WarehouseGroupDTO]
}
