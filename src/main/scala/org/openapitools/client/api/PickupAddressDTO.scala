package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PickupAddressDTO._

case class PickupAddressDTO (
  /* Страна. */
  country: Option[String],
/* Город. */
  city: Option[String],
/* Улица. */
  street: Option[String],
/* Номер дома. */
  house: Option[String],
/* Почтовый индекс. */
  postcode: Option[String])

object PickupAddressDTO {
  import DateTimeCodecs._

  implicit val PickupAddressDTOCodecJson: CodecJson[PickupAddressDTO] = CodecJson.derive[PickupAddressDTO]
  implicit val PickupAddressDTODecoder: EntityDecoder[PickupAddressDTO] = jsonOf[PickupAddressDTO]
  implicit val PickupAddressDTOEncoder: EntityEncoder[PickupAddressDTO] = jsonEncoderOf[PickupAddressDTO]
}
