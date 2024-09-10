package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetGoodsFeedbackResponse._

case class GetGoodsFeedbackResponse (
  status: Option[ApiResponseStatusType],
result: Option[GoodsFeedbackListDTO])

object GetGoodsFeedbackResponse {
  import DateTimeCodecs._

  implicit val GetGoodsFeedbackResponseCodecJson: CodecJson[GetGoodsFeedbackResponse] = CodecJson.derive[GetGoodsFeedbackResponse]
  implicit val GetGoodsFeedbackResponseDecoder: EntityDecoder[GetGoodsFeedbackResponse] = jsonOf[GetGoodsFeedbackResponse]
  implicit val GetGoodsFeedbackResponseEncoder: EntityEncoder[GetGoodsFeedbackResponse] = jsonEncoderOf[GetGoodsFeedbackResponse]
}
