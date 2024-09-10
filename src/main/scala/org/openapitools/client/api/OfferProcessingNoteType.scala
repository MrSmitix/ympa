package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferProcessingNoteType._

case class OfferProcessingNoteType (
  
object OfferProcessingNoteType {
  import DateTimeCodecs._

  implicit val OfferProcessingNoteTypeCodecJson: CodecJson[OfferProcessingNoteType] = CodecJson.derive[OfferProcessingNoteType]
  implicit val OfferProcessingNoteTypeDecoder: EntityDecoder[OfferProcessingNoteType] = jsonOf[OfferProcessingNoteType]
  implicit val OfferProcessingNoteTypeEncoder: EntityEncoder[OfferProcessingNoteType] = jsonEncoderOf[OfferProcessingNoteType]
}
