package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateGoodsFeedbackCommentResponse._

case class UpdateGoodsFeedbackCommentResponse (
  status: Option[ApiResponseStatusType],
result: Option[GoodsFeedbackCommentDTO])

object UpdateGoodsFeedbackCommentResponse {
  import DateTimeCodecs._

  implicit val UpdateGoodsFeedbackCommentResponseCodecJson: CodecJson[UpdateGoodsFeedbackCommentResponse] = CodecJson.derive[UpdateGoodsFeedbackCommentResponse]
  implicit val UpdateGoodsFeedbackCommentResponseDecoder: EntityDecoder[UpdateGoodsFeedbackCommentResponse] = jsonOf[UpdateGoodsFeedbackCommentResponse]
  implicit val UpdateGoodsFeedbackCommentResponseEncoder: EntityEncoder[UpdateGoodsFeedbackCommentResponse] = jsonEncoderOf[UpdateGoodsFeedbackCommentResponse]
}
