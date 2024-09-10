package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBoxLayoutPartialCountDTO._

case class OrderBoxLayoutPartialCountDTO (
  /* Номер части, начиная с 1. */
  current: Integer,
/* На сколько всего частей разделен товар. */
  total: Integer)

object OrderBoxLayoutPartialCountDTO {
  import DateTimeCodecs._

  implicit val OrderBoxLayoutPartialCountDTOCodecJson: CodecJson[OrderBoxLayoutPartialCountDTO] = CodecJson.derive[OrderBoxLayoutPartialCountDTO]
  implicit val OrderBoxLayoutPartialCountDTODecoder: EntityDecoder[OrderBoxLayoutPartialCountDTO] = jsonOf[OrderBoxLayoutPartialCountDTO]
  implicit val OrderBoxLayoutPartialCountDTOEncoder: EntityEncoder[OrderBoxLayoutPartialCountDTO] = jsonEncoderOf[OrderBoxLayoutPartialCountDTO]
}
