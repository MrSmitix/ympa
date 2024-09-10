package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedbackCommentAuthorDTO._

case class FeedbackCommentAuthorDTO (
  `type`: Option[FeedbackCommentAuthorType],
/* Имя автора отзыва или название магазина. */
  name: Option[String])

object FeedbackCommentAuthorDTO {
  import DateTimeCodecs._

  implicit val FeedbackCommentAuthorDTOCodecJson: CodecJson[FeedbackCommentAuthorDTO] = CodecJson.derive[FeedbackCommentAuthorDTO]
  implicit val FeedbackCommentAuthorDTODecoder: EntityDecoder[FeedbackCommentAuthorDTO] = jsonOf[FeedbackCommentAuthorDTO]
  implicit val FeedbackCommentAuthorDTOEncoder: EntityEncoder[FeedbackCommentAuthorDTO] = jsonEncoderOf[FeedbackCommentAuthorDTO]
}
