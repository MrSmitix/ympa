package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferMappingErrorType._

case class OfferMappingErrorType (
  
object OfferMappingErrorType {
  import DateTimeCodecs._

  implicit val OfferMappingErrorTypeCodecJson: CodecJson[OfferMappingErrorType] = CodecJson.derive[OfferMappingErrorType]
  implicit val OfferMappingErrorTypeDecoder: EntityDecoder[OfferMappingErrorType] = jsonOf[OfferMappingErrorType]
  implicit val OfferMappingErrorTypeEncoder: EntityEncoder[OfferMappingErrorType] = jsonEncoderOf[OfferMappingErrorType]
}
