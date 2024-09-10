package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackStatisticsDTO._

case class GoodsFeedbackStatisticsDTO (
  /* Оценка товара. */
  rating: Integer,
/* Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  */
  commentsCount: Long,
/* Рекомендуют ли этот товар. */
  recommended: Option[Boolean],
/* Количество баллов Плюса, которое автор получил за отзыв. */
  paidAmount: Option[Long])

object GoodsFeedbackStatisticsDTO {
  import DateTimeCodecs._

  implicit val GoodsFeedbackStatisticsDTOCodecJson: CodecJson[GoodsFeedbackStatisticsDTO] = CodecJson.derive[GoodsFeedbackStatisticsDTO]
  implicit val GoodsFeedbackStatisticsDTODecoder: EntityDecoder[GoodsFeedbackStatisticsDTO] = jsonOf[GoodsFeedbackStatisticsDTO]
  implicit val GoodsFeedbackStatisticsDTOEncoder: EntityEncoder[GoodsFeedbackStatisticsDTO] = jsonEncoderOf[GoodsFeedbackStatisticsDTO]
}
