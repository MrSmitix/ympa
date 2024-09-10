package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WarehouseAddressDTO._

case class WarehouseAddressDTO (
  /* Город. */
  city: String,
/* Улица. */
  street: Option[String],
/* Номер дома. */
  number: Option[String],
/* Номер строения. */
  building: Option[String],
/* Номер корпуса. */
  block: Option[String],
gps: GpsDTO)

object WarehouseAddressDTO {
  import DateTimeCodecs._

  implicit val WarehouseAddressDTOCodecJson: CodecJson[WarehouseAddressDTO] = CodecJson.derive[WarehouseAddressDTO]
  implicit val WarehouseAddressDTODecoder: EntityDecoder[WarehouseAddressDTO] = jsonOf[WarehouseAddressDTO]
  implicit val WarehouseAddressDTOEncoder: EntityEncoder[WarehouseAddressDTO] = jsonEncoderOf[WarehouseAddressDTO]
}
