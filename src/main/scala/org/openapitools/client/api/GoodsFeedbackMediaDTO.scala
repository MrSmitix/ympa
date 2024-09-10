package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackMediaDTO._

case class GoodsFeedbackMediaDTO (
  /* Ссылки на фото. */
  photos: Option[List[String]],
/* Ссылки на видео. */
  videos: Option[List[String]])

object GoodsFeedbackMediaDTO {
  import DateTimeCodecs._

  implicit val GoodsFeedbackMediaDTOCodecJson: CodecJson[GoodsFeedbackMediaDTO] = CodecJson.derive[GoodsFeedbackMediaDTO]
  implicit val GoodsFeedbackMediaDTODecoder: EntityDecoder[GoodsFeedbackMediaDTO] = jsonOf[GoodsFeedbackMediaDTO]
  implicit val GoodsFeedbackMediaDTOEncoder: EntityEncoder[GoodsFeedbackMediaDTO] = jsonEncoderOf[GoodsFeedbackMediaDTO]
}
