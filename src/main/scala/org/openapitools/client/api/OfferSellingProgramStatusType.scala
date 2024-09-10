package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferSellingProgramStatusType._

case class OfferSellingProgramStatusType (
  
object OfferSellingProgramStatusType {
  import DateTimeCodecs._

  implicit val OfferSellingProgramStatusTypeCodecJson: CodecJson[OfferSellingProgramStatusType] = CodecJson.derive[OfferSellingProgramStatusType]
  implicit val OfferSellingProgramStatusTypeDecoder: EntityDecoder[OfferSellingProgramStatusType] = jsonOf[OfferSellingProgramStatusType]
  implicit val OfferSellingProgramStatusTypeEncoder: EntityEncoder[OfferSellingProgramStatusType] = jsonEncoderOf[OfferSellingProgramStatusType]
}
