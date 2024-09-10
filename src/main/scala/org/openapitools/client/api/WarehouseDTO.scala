package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WarehouseDTO._

case class WarehouseDTO (
  /* Идентификатор склада. */
  id: Long,
/* Название склада. */
  name: String,
/* Идентификатор кампании в API и идентификатор магазина. */
  campaignId: Long,
/* Возможна ли доставка по модели Экспресс. */
  express: Boolean,
address: Option[WarehouseAddressDTO])

object WarehouseDTO {
  import DateTimeCodecs._

  implicit val WarehouseDTOCodecJson: CodecJson[WarehouseDTO] = CodecJson.derive[WarehouseDTO]
  implicit val WarehouseDTODecoder: EntityDecoder[WarehouseDTO] = jsonOf[WarehouseDTO]
  implicit val WarehouseDTOEncoder: EntityEncoder[WarehouseDTO] = jsonEncoderOf[WarehouseDTO]
}
