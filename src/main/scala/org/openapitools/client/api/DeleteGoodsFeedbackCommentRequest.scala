package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteGoodsFeedbackCommentRequest._

case class DeleteGoodsFeedbackCommentRequest (
  /* Идентификатор комментария к отзыву.  */
  id: Long)

object DeleteGoodsFeedbackCommentRequest {
  import DateTimeCodecs._

  implicit val DeleteGoodsFeedbackCommentRequestCodecJson: CodecJson[DeleteGoodsFeedbackCommentRequest] = CodecJson.derive[DeleteGoodsFeedbackCommentRequest]
  implicit val DeleteGoodsFeedbackCommentRequestDecoder: EntityDecoder[DeleteGoodsFeedbackCommentRequest] = jsonOf[DeleteGoodsFeedbackCommentRequest]
  implicit val DeleteGoodsFeedbackCommentRequestEncoder: EntityEncoder[DeleteGoodsFeedbackCommentRequest] = jsonEncoderOf[DeleteGoodsFeedbackCommentRequest]
}
