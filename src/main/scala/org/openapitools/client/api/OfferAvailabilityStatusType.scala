package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferAvailabilityStatusType._

case class OfferAvailabilityStatusType (
  
object OfferAvailabilityStatusType {
  import DateTimeCodecs._

  implicit val OfferAvailabilityStatusTypeCodecJson: CodecJson[OfferAvailabilityStatusType] = CodecJson.derive[OfferAvailabilityStatusType]
  implicit val OfferAvailabilityStatusTypeDecoder: EntityDecoder[OfferAvailabilityStatusType] = jsonOf[OfferAvailabilityStatusType]
  implicit val OfferAvailabilityStatusTypeEncoder: EntityEncoder[OfferAvailabilityStatusType] = jsonEncoderOf[OfferAvailabilityStatusType]
}
