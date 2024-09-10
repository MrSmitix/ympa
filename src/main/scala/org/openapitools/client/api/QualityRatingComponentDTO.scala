package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QualityRatingComponentDTO._

case class QualityRatingComponentDTO (
  /* Значение составляющей в процентах. */
  value: Double,
componentType: QualityRatingComponentType)

object QualityRatingComponentDTO {
  import DateTimeCodecs._

  implicit val QualityRatingComponentDTOCodecJson: CodecJson[QualityRatingComponentDTO] = CodecJson.derive[QualityRatingComponentDTO]
  implicit val QualityRatingComponentDTODecoder: EntityDecoder[QualityRatingComponentDTO] = jsonOf[QualityRatingComponentDTO]
  implicit val QualityRatingComponentDTOEncoder: EntityEncoder[QualityRatingComponentDTO] = jsonEncoderOf[QualityRatingComponentDTO]
}
