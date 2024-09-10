package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import QualityRatingDTO._

case class QualityRatingDTO (
  /* Значение индекса качества. */
  rating: Long,
/* Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
  calculationDate: LocalDate,
/* Составляющие индекса качества. */
  components: List[QualityRatingComponentDTO])

object QualityRatingDTO {
  import DateTimeCodecs._

  implicit val QualityRatingDTOCodecJson: CodecJson[QualityRatingDTO] = CodecJson.derive[QualityRatingDTO]
  implicit val QualityRatingDTODecoder: EntityDecoder[QualityRatingDTO] = jsonOf[QualityRatingDTO]
  implicit val QualityRatingDTOEncoder: EntityEncoder[QualityRatingDTO] = jsonEncoderOf[QualityRatingDTO]
}
