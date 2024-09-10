package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateGoodsFeedbackCommentRequest._

case class UpdateGoodsFeedbackCommentRequest (
  /* Идентификатор отзыва.  */
  feedbackId: Long,
comment: UpdateGoodsFeedbackCommentDTO)

object UpdateGoodsFeedbackCommentRequest {
  import DateTimeCodecs._

  implicit val UpdateGoodsFeedbackCommentRequestCodecJson: CodecJson[UpdateGoodsFeedbackCommentRequest] = CodecJson.derive[UpdateGoodsFeedbackCommentRequest]
  implicit val UpdateGoodsFeedbackCommentRequestDecoder: EntityDecoder[UpdateGoodsFeedbackCommentRequest] = jsonOf[UpdateGoodsFeedbackCommentRequest]
  implicit val UpdateGoodsFeedbackCommentRequestEncoder: EntityEncoder[UpdateGoodsFeedbackCommentRequest] = jsonEncoderOf[UpdateGoodsFeedbackCommentRequest]
}
