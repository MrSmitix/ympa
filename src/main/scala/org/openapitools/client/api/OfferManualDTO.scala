package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferManualDTO._

case class OfferManualDTO (
  /* Ссылка на инструкцию. */
  url: String,
/* Название инструкции, которое будет отображаться на карточке товара.  */
  title: Option[String])

object OfferManualDTO {
  import DateTimeCodecs._

  implicit val OfferManualDTOCodecJson: CodecJson[OfferManualDTO] = CodecJson.derive[OfferManualDTO]
  implicit val OfferManualDTODecoder: EntityDecoder[OfferManualDTO] = jsonOf[OfferManualDTO]
  implicit val OfferManualDTOEncoder: EntityEncoder[OfferManualDTO] = jsonEncoderOf[OfferManualDTO]
}
