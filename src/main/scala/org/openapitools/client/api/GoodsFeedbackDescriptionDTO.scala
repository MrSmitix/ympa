package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackDescriptionDTO._

case class GoodsFeedbackDescriptionDTO (
  /* Описание плюсов товара в отзыве. */
  advantages: Option[String],
/* Описание минусов товара в отзыве. */
  disadvantages: Option[String],
/* Комментарий в отзыве. */
  comment: Option[String])

object GoodsFeedbackDescriptionDTO {
  import DateTimeCodecs._

  implicit val GoodsFeedbackDescriptionDTOCodecJson: CodecJson[GoodsFeedbackDescriptionDTO] = CodecJson.derive[GoodsFeedbackDescriptionDTO]
  implicit val GoodsFeedbackDescriptionDTODecoder: EntityDecoder[GoodsFeedbackDescriptionDTO] = jsonOf[GoodsFeedbackDescriptionDTO]
  implicit val GoodsFeedbackDescriptionDTOEncoder: EntityEncoder[GoodsFeedbackDescriptionDTO] = jsonEncoderOf[GoodsFeedbackDescriptionDTO]
}
