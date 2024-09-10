package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateGoodsFeedbackCommentDTO._

case class UpdateGoodsFeedbackCommentDTO (
  /* Идентификатор комментария к отзыву.  */
  id: Option[Long],
/* Идентификатор комментария к отзыву.  */
  parentId: Option[Long],
/* Текст комментария. */
  text: String)

object UpdateGoodsFeedbackCommentDTO {
  import DateTimeCodecs._

  implicit val UpdateGoodsFeedbackCommentDTOCodecJson: CodecJson[UpdateGoodsFeedbackCommentDTO] = CodecJson.derive[UpdateGoodsFeedbackCommentDTO]
  implicit val UpdateGoodsFeedbackCommentDTODecoder: EntityDecoder[UpdateGoodsFeedbackCommentDTO] = jsonOf[UpdateGoodsFeedbackCommentDTO]
  implicit val UpdateGoodsFeedbackCommentDTOEncoder: EntityEncoder[UpdateGoodsFeedbackCommentDTO] = jsonEncoderOf[UpdateGoodsFeedbackCommentDTO]
}
