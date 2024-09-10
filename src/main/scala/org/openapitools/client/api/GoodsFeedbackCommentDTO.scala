package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackCommentDTO._

case class GoodsFeedbackCommentDTO (
  /* Идентификатор комментария к отзыву.  */
  id: Long,
/* Текст комментария. */
  text: String,
/* Может ли продавец изменять комментарий или удалять его. */
  canModify: Option[Boolean],
/* Идентификатор комментария к отзыву.  */
  parentId: Option[Long],
author: GoodsFeedbackCommentAuthorDTO,
status: GoodsFeedbackCommentStatusType)

object GoodsFeedbackCommentDTO {
  import DateTimeCodecs._

  implicit val GoodsFeedbackCommentDTOCodecJson: CodecJson[GoodsFeedbackCommentDTO] = CodecJson.derive[GoodsFeedbackCommentDTO]
  implicit val GoodsFeedbackCommentDTODecoder: EntityDecoder[GoodsFeedbackCommentDTO] = jsonOf[GoodsFeedbackCommentDTO]
  implicit val GoodsFeedbackCommentDTOEncoder: EntityEncoder[GoodsFeedbackCommentDTO] = jsonEncoderOf[GoodsFeedbackCommentDTO]
}
