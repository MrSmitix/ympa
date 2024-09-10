package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferConditionQualityType._

case class OfferConditionQualityType (
  
object OfferConditionQualityType {
  import DateTimeCodecs._

  implicit val OfferConditionQualityTypeCodecJson: CodecJson[OfferConditionQualityType] = CodecJson.derive[OfferConditionQualityType]
  implicit val OfferConditionQualityTypeDecoder: EntityDecoder[OfferConditionQualityType] = jsonOf[OfferConditionQualityType]
  implicit val OfferConditionQualityTypeEncoder: EntityEncoder[OfferConditionQualityType] = jsonEncoderOf[OfferConditionQualityType]
}
