package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferType._

case class OfferType (
  
object OfferType {
  import DateTimeCodecs._

  implicit val OfferTypeCodecJson: CodecJson[OfferType] = CodecJson.derive[OfferType]
  implicit val OfferTypeDecoder: EntityDecoder[OfferType] = jsonOf[OfferType]
  implicit val OfferTypeEncoder: EntityEncoder[OfferType] = jsonEncoderOf[OfferType]
}
