package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetGoodsFeedbackCommentsRequest._

case class GetGoodsFeedbackCommentsRequest (
  /* Идентификатор отзыва.  */
  feedbackId: Long)

object GetGoodsFeedbackCommentsRequest {
  import DateTimeCodecs._

  implicit val GetGoodsFeedbackCommentsRequestCodecJson: CodecJson[GetGoodsFeedbackCommentsRequest] = CodecJson.derive[GetGoodsFeedbackCommentsRequest]
  implicit val GetGoodsFeedbackCommentsRequestDecoder: EntityDecoder[GetGoodsFeedbackCommentsRequest] = jsonOf[GetGoodsFeedbackCommentsRequest]
  implicit val GetGoodsFeedbackCommentsRequestEncoder: EntityEncoder[GetGoodsFeedbackCommentsRequest] = jsonEncoderOf[GetGoodsFeedbackCommentsRequest]
}
