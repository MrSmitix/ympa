package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetFeedbackListResponse._

case class GetFeedbackListResponse (
  status: Option[ApiResponseStatusType],
result: Option[FeedbackListDTO])

object GetFeedbackListResponse {
  import DateTimeCodecs._

  implicit val GetFeedbackListResponseCodecJson: CodecJson[GetFeedbackListResponse] = CodecJson.derive[GetFeedbackListResponse]
  implicit val GetFeedbackListResponseDecoder: EntityDecoder[GetFeedbackListResponse] = jsonOf[GetFeedbackListResponse]
  implicit val GetFeedbackListResponseEncoder: EntityEncoder[GetFeedbackListResponse] = jsonEncoderOf[GetFeedbackListResponse]
}
