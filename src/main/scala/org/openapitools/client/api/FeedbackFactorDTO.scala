package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackFactorDTO._

case class FeedbackFactorDTO (
  /* Идентификатор параметра. */
  id: Option[Long],
/* Название параметра. Например, `Скорость обработки заказа`. */
  title: Option[String],
/* Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. */
  description: Option[String],
/* Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).  */
  value: Option[Integer])

object FeedbackFactorDTO {
  import DateTimeCodecs._

  implicit val FeedbackFactorDTOCodecJson: CodecJson[FeedbackFactorDTO] = CodecJson.derive[FeedbackFactorDTO]
  implicit val FeedbackFactorDTODecoder: EntityDecoder[FeedbackFactorDTO] = jsonOf[FeedbackFactorDTO]
  implicit val FeedbackFactorDTOEncoder: EntityEncoder[FeedbackFactorDTO] = jsonEncoderOf[FeedbackFactorDTO]
}
