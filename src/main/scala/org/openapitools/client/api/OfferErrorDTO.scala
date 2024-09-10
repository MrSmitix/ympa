package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferErrorDTO._

case class OfferErrorDTO (
  /* Тип ошибки. */
  message: Option[String],
/* Пояснение. */
  comment: Option[String])

object OfferErrorDTO {
  import DateTimeCodecs._

  implicit val OfferErrorDTOCodecJson: CodecJson[OfferErrorDTO] = CodecJson.derive[OfferErrorDTO]
  implicit val OfferErrorDTODecoder: EntityDecoder[OfferErrorDTO] = jsonOf[OfferErrorDTO]
  implicit val OfferErrorDTOEncoder: EntityEncoder[OfferErrorDTO] = jsonEncoderOf[OfferErrorDTO]
}
