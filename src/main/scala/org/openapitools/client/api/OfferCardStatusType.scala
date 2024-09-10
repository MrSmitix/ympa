package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferCardStatusType._

case class OfferCardStatusType (
  
object OfferCardStatusType {
  import DateTimeCodecs._

  implicit val OfferCardStatusTypeCodecJson: CodecJson[OfferCardStatusType] = CodecJson.derive[OfferCardStatusType]
  implicit val OfferCardStatusTypeDecoder: EntityDecoder[OfferCardStatusType] = jsonOf[OfferCardStatusType]
  implicit val OfferCardStatusTypeEncoder: EntityEncoder[OfferCardStatusType] = jsonEncoderOf[OfferCardStatusType]
}
