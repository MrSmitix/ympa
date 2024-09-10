package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetChatHistoryResponse._

case class GetChatHistoryResponse (
  status: Option[ApiResponseStatusType],
result: Option[ChatMessagesResultDTO])

object GetChatHistoryResponse {
  import DateTimeCodecs._

  implicit val GetChatHistoryResponseCodecJson: CodecJson[GetChatHistoryResponse] = CodecJson.derive[GetChatHistoryResponse]
  implicit val GetChatHistoryResponseDecoder: EntityDecoder[GetChatHistoryResponse] = jsonOf[GetChatHistoryResponse]
  implicit val GetChatHistoryResponseEncoder: EntityEncoder[GetChatHistoryResponse] = jsonEncoderOf[GetChatHistoryResponse]
}
