package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PartnerShipmentWarehouseDTO._

case class PartnerShipmentWarehouseDTO (
  /* Идентификатор склада отправления. */
  id: Option[Long],
/* Наименование склада отправления. */
  name: Option[String],
/* Адрес склада отправления. */
  address: Option[String])

object PartnerShipmentWarehouseDTO {
  import DateTimeCodecs._

  implicit val PartnerShipmentWarehouseDTOCodecJson: CodecJson[PartnerShipmentWarehouseDTO] = CodecJson.derive[PartnerShipmentWarehouseDTO]
  implicit val PartnerShipmentWarehouseDTODecoder: EntityDecoder[PartnerShipmentWarehouseDTO] = jsonOf[PartnerShipmentWarehouseDTO]
  implicit val PartnerShipmentWarehouseDTOEncoder: EntityEncoder[PartnerShipmentWarehouseDTO] = jsonEncoderOf[PartnerShipmentWarehouseDTO]
}
