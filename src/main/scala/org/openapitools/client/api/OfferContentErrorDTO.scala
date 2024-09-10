package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferContentErrorDTO._

case class OfferContentErrorDTO (
  `type`: OfferContentErrorType,
/* Идентификатор характеристики, с которой связана ошибка. */
  parameterId: Option[Long],
/* Текст ошибки. */
  message: String)

object OfferContentErrorDTO {
  import DateTimeCodecs._

  implicit val OfferContentErrorDTOCodecJson: CodecJson[OfferContentErrorDTO] = CodecJson.derive[OfferContentErrorDTO]
  implicit val OfferContentErrorDTODecoder: EntityDecoder[OfferContentErrorDTO] = jsonOf[OfferContentErrorDTO]
  implicit val OfferContentErrorDTOEncoder: EntityEncoder[OfferContentErrorDTO] = jsonEncoderOf[OfferContentErrorDTO]
}
