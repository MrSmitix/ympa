package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackGradesDTO._

case class FeedbackGradesDTO (
  /* Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). */
  average: Option[BigDecimal],
/* Количество пользователей, считающих отзыв полезным. */
  agreeCount: Option[Long],
/* Количество пользователей, считающих отзыв бесполезным. */
  rejectCount: Option[Long],
/* Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.  */
  factors: List[FeedbackFactorDTO])

object FeedbackGradesDTO {
  import DateTimeCodecs._

  implicit val FeedbackGradesDTOCodecJson: CodecJson[FeedbackGradesDTO] = CodecJson.derive[FeedbackGradesDTO]
  implicit val FeedbackGradesDTODecoder: EntityDecoder[FeedbackGradesDTO] = jsonOf[FeedbackGradesDTO]
  implicit val FeedbackGradesDTOEncoder: EntityEncoder[FeedbackGradesDTO] = jsonEncoderOf[FeedbackGradesDTO]
}
