package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferConditionType._

case class OfferConditionType (
  
object OfferConditionType {
  import DateTimeCodecs._

  implicit val OfferConditionTypeCodecJson: CodecJson[OfferConditionType] = CodecJson.derive[OfferConditionType]
  implicit val OfferConditionTypeDecoder: EntityDecoder[OfferConditionType] = jsonOf[OfferConditionType]
  implicit val OfferConditionTypeEncoder: EntityEncoder[OfferConditionType] = jsonEncoderOf[OfferConditionType]
}
