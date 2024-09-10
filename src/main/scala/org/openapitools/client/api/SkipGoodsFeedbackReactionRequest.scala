package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SkipGoodsFeedbackReactionRequest._

case class SkipGoodsFeedbackReactionRequest (
  /* Список идентификаторов отзывов, на которые магазин не будет отвечать. */
  feedbackIds: Set[Long])

object SkipGoodsFeedbackReactionRequest {
  import DateTimeCodecs._

  implicit val SkipGoodsFeedbackReactionRequestCodecJson: CodecJson[SkipGoodsFeedbackReactionRequest] = CodecJson.derive[SkipGoodsFeedbackReactionRequest]
  implicit val SkipGoodsFeedbackReactionRequestDecoder: EntityDecoder[SkipGoodsFeedbackReactionRequest] = jsonOf[SkipGoodsFeedbackReactionRequest]
  implicit val SkipGoodsFeedbackReactionRequestEncoder: EntityEncoder[SkipGoodsFeedbackReactionRequest] = jsonEncoderOf[SkipGoodsFeedbackReactionRequest]
}
