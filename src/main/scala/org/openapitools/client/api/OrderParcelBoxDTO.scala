package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderParcelBoxDTO._

case class OrderParcelBoxDTO (
  /* Идентификатор грузоместа. */
  id: Option[Long],
/* Идентификатор грузового места в информационной системе магазина. */
  fulfilmentId: Option[String])

object OrderParcelBoxDTO {
  import DateTimeCodecs._

  implicit val OrderParcelBoxDTOCodecJson: CodecJson[OrderParcelBoxDTO] = CodecJson.derive[OrderParcelBoxDTO]
  implicit val OrderParcelBoxDTODecoder: EntityDecoder[OrderParcelBoxDTO] = jsonOf[OrderParcelBoxDTO]
  implicit val OrderParcelBoxDTOEncoder: EntityEncoder[OrderParcelBoxDTO] = jsonEncoderOf[OrderParcelBoxDTO]
}
