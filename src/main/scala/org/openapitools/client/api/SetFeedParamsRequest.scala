package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetFeedParamsRequest._

case class SetFeedParamsRequest (
  /* Параметры прайс-листа.  Обязательный параметр.  */
  parameters: List[FeedParameterDTO])

object SetFeedParamsRequest {
  import DateTimeCodecs._

  implicit val SetFeedParamsRequestCodecJson: CodecJson[SetFeedParamsRequest] = CodecJson.derive[SetFeedParamsRequest]
  implicit val SetFeedParamsRequestDecoder: EntityDecoder[SetFeedParamsRequest] = jsonOf[SetFeedParamsRequest]
  implicit val SetFeedParamsRequestEncoder: EntityEncoder[SetFeedParamsRequest] = jsonEncoderOf[SetFeedParamsRequest]
}
