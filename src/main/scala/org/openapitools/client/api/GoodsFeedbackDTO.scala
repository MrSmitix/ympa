package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import GoodsFeedbackDTO._

case class GoodsFeedbackDTO (
  /* Идентификатор отзыва.  */
  feedbackId: Long,
/* Дата и время создания отзыва. */
  createdAt: OffsetDateTime,
/* Нужен ли ответ на отзыв. */
  needReaction: Boolean,
identifiers: GoodsFeedbackIdentifiersDTO,
/* Имя автора отзыва. */
  author: Option[String],
description: Option[GoodsFeedbackDescriptionDTO],
media: Option[GoodsFeedbackMediaDTO],
statistics: GoodsFeedbackStatisticsDTO)

object GoodsFeedbackDTO {
  import DateTimeCodecs._

  implicit val GoodsFeedbackDTOCodecJson: CodecJson[GoodsFeedbackDTO] = CodecJson.derive[GoodsFeedbackDTO]
  implicit val GoodsFeedbackDTODecoder: EntityDecoder[GoodsFeedbackDTO] = jsonOf[GoodsFeedbackDTO]
  implicit val GoodsFeedbackDTOEncoder: EntityEncoder[GoodsFeedbackDTO] = jsonEncoderOf[GoodsFeedbackDTO]
}
