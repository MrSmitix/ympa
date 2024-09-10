package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QualityRatingDetailsDTO._

case class QualityRatingDetailsDTO (
  /* Список заказов, которые повлияли на индекс качества. */
  affectedOrders: List[QualityRatingAffectedOrderDTO])

object QualityRatingDetailsDTO {
  import DateTimeCodecs._

  implicit val QualityRatingDetailsDTOCodecJson: CodecJson[QualityRatingDetailsDTO] = CodecJson.derive[QualityRatingDetailsDTO]
  implicit val QualityRatingDetailsDTODecoder: EntityDecoder[QualityRatingDetailsDTO] = jsonOf[QualityRatingDetailsDTO]
  implicit val QualityRatingDetailsDTOEncoder: EntityEncoder[QualityRatingDetailsDTO] = jsonEncoderOf[QualityRatingDetailsDTO]
}
