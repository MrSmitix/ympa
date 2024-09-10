package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OutletResponseDTO._

case class OutletResponseDTO (
  /* Идентификатор точки продаж, присвоенный Маркетом. */
  id: Option[Long])

object OutletResponseDTO {
  import DateTimeCodecs._

  implicit val OutletResponseDTOCodecJson: CodecJson[OutletResponseDTO] = CodecJson.derive[OutletResponseDTO]
  implicit val OutletResponseDTODecoder: EntityDecoder[OutletResponseDTO] = jsonOf[OutletResponseDTO]
  implicit val OutletResponseDTOEncoder: EntityEncoder[OutletResponseDTO] = jsonEncoderOf[OutletResponseDTO]
}
