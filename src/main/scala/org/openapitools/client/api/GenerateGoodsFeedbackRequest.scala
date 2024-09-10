package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerateGoodsFeedbackRequest._

case class GenerateGoodsFeedbackRequest (
  /* Идентификатор бизнеса. */
  businessId: Long)

object GenerateGoodsFeedbackRequest {
  import DateTimeCodecs._

  implicit val GenerateGoodsFeedbackRequestCodecJson: CodecJson[GenerateGoodsFeedbackRequest] = CodecJson.derive[GenerateGoodsFeedbackRequest]
  implicit val GenerateGoodsFeedbackRequestDecoder: EntityDecoder[GenerateGoodsFeedbackRequest] = jsonOf[GenerateGoodsFeedbackRequest]
  implicit val GenerateGoodsFeedbackRequestEncoder: EntityEncoder[GenerateGoodsFeedbackRequest] = jsonEncoderOf[GenerateGoodsFeedbackRequest]
}
