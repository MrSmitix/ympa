package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferProcessingStatusType._

case class OfferProcessingStatusType (
  
object OfferProcessingStatusType {
  import DateTimeCodecs._

  implicit val OfferProcessingStatusTypeCodecJson: CodecJson[OfferProcessingStatusType] = CodecJson.derive[OfferProcessingStatusType]
  implicit val OfferProcessingStatusTypeDecoder: EntityDecoder[OfferProcessingStatusType] = jsonOf[OfferProcessingStatusType]
  implicit val OfferProcessingStatusTypeEncoder: EntityEncoder[OfferProcessingStatusType] = jsonEncoderOf[OfferProcessingStatusType]
}
