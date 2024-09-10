package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AffectedOrderQualityRatingComponentType._

case class AffectedOrderQualityRatingComponentType (
  
object AffectedOrderQualityRatingComponentType {
  import DateTimeCodecs._

  implicit val AffectedOrderQualityRatingComponentTypeCodecJson: CodecJson[AffectedOrderQualityRatingComponentType] = CodecJson.derive[AffectedOrderQualityRatingComponentType]
  implicit val AffectedOrderQualityRatingComponentTypeDecoder: EntityDecoder[AffectedOrderQualityRatingComponentType] = jsonOf[AffectedOrderQualityRatingComponentType]
  implicit val AffectedOrderQualityRatingComponentTypeEncoder: EntityEncoder[AffectedOrderQualityRatingComponentType] = jsonEncoderOf[AffectedOrderQualityRatingComponentType]
}
