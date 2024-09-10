package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferContentErrorType._

case class OfferContentErrorType (
  
object OfferContentErrorType {
  import DateTimeCodecs._

  implicit val OfferContentErrorTypeCodecJson: CodecJson[OfferContentErrorType] = CodecJson.derive[OfferContentErrorType]
  implicit val OfferContentErrorTypeDecoder: EntityDecoder[OfferContentErrorType] = jsonOf[OfferContentErrorType]
  implicit val OfferContentErrorTypeEncoder: EntityEncoder[OfferContentErrorType] = jsonEncoderOf[OfferContentErrorType]
}
