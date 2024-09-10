package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferMappingKindType._

case class OfferMappingKindType (
  
object OfferMappingKindType {
  import DateTimeCodecs._

  implicit val OfferMappingKindTypeCodecJson: CodecJson[OfferMappingKindType] = CodecJson.derive[OfferMappingKindType]
  implicit val OfferMappingKindTypeDecoder: EntityDecoder[OfferMappingKindType] = jsonOf[OfferMappingKindType]
  implicit val OfferMappingKindTypeEncoder: EntityEncoder[OfferMappingKindType] = jsonEncoderOf[OfferMappingKindType]
}
