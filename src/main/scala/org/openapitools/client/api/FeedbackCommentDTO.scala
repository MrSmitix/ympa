package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import FeedbackCommentDTO._

case class FeedbackCommentDTO (
  /* Идентификатор ответа. */
  id: Option[Long],
/* Идентификатор родительского ответа. */
  parentId: Option[Long],
/* Текст ответа. */
  body: Option[String],
/* Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  createdAt: Option[OffsetDateTime],
/* Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  updatedAt: Option[OffsetDateTime],
author: Option[FeedbackCommentAuthorDTO],
/* Дочерние ответы. */
  children: Option[List[FeedbackCommentDTO]])

object FeedbackCommentDTO {
  import DateTimeCodecs._

  implicit val FeedbackCommentDTOCodecJson: CodecJson[FeedbackCommentDTO] = CodecJson.derive[FeedbackCommentDTO]
  implicit val FeedbackCommentDTODecoder: EntityDecoder[FeedbackCommentDTO] = jsonOf[FeedbackCommentDTO]
  implicit val FeedbackCommentDTOEncoder: EntityEncoder[FeedbackCommentDTO] = jsonEncoderOf[FeedbackCommentDTO]
}
