package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GpsDTO._

case class GpsDTO (
  /* Широта. */
  latitude: BigDecimal,
/* Долгота. */
  longitude: BigDecimal)

object GpsDTO {
  import DateTimeCodecs._

  implicit val GpsDTOCodecJson: CodecJson[GpsDTO] = CodecJson.derive[GpsDTO]
  implicit val GpsDTODecoder: EntityDecoder[GpsDTO] = jsonOf[GpsDTO]
  implicit val GpsDTOEncoder: EntityEncoder[GpsDTO] = jsonEncoderOf[GpsDTO]
}
