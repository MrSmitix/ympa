package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferProcessingNoteDTO._

case class OfferProcessingNoteDTO (
  `type`: Option[OfferProcessingNoteType],
/* Дополнительная информация о причине отклонения товара.  */
  payload: Option[String])

object OfferProcessingNoteDTO {
  import DateTimeCodecs._

  implicit val OfferProcessingNoteDTOCodecJson: CodecJson[OfferProcessingNoteDTO] = CodecJson.derive[OfferProcessingNoteDTO]
  implicit val OfferProcessingNoteDTODecoder: EntityDecoder[OfferProcessingNoteDTO] = jsonOf[OfferProcessingNoteDTO]
  implicit val OfferProcessingNoteDTOEncoder: EntityEncoder[OfferProcessingNoteDTO] = jsonEncoderOf[OfferProcessingNoteDTO]
}
