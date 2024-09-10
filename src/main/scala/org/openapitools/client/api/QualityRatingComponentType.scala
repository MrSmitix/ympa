package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QualityRatingComponentType._

case class QualityRatingComponentType (
  
object QualityRatingComponentType {
  import DateTimeCodecs._

  implicit val QualityRatingComponentTypeCodecJson: CodecJson[QualityRatingComponentType] = CodecJson.derive[QualityRatingComponentType]
  implicit val QualityRatingComponentTypeDecoder: EntityDecoder[QualityRatingComponentType] = jsonOf[QualityRatingComponentType]
  implicit val QualityRatingComponentTypeEncoder: EntityEncoder[QualityRatingComponentType] = jsonEncoderOf[QualityRatingComponentType]
}
