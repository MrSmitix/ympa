package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferProcessingStateDTO._

case class OfferProcessingStateDTO (
  status: Option[OfferProcessingStatusType],
/* Причины, по которым товар не прошел модерацию. */
  notes: Option[List[OfferProcessingNoteDTO]])

object OfferProcessingStateDTO {
  import DateTimeCodecs._

  implicit val OfferProcessingStateDTOCodecJson: CodecJson[OfferProcessingStateDTO] = CodecJson.derive[OfferProcessingStateDTO]
  implicit val OfferProcessingStateDTODecoder: EntityDecoder[OfferProcessingStateDTO] = jsonOf[OfferProcessingStateDTO]
  implicit val OfferProcessingStateDTOEncoder: EntityEncoder[OfferProcessingStateDTO] = jsonEncoderOf[OfferProcessingStateDTO]
}
