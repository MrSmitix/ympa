package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetChatHistoryRequest._

case class GetChatHistoryRequest (
  /* Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. */
  messageIdFrom: Option[Long])

object GetChatHistoryRequest {
  import DateTimeCodecs._

  implicit val GetChatHistoryRequestCodecJson: CodecJson[GetChatHistoryRequest] = CodecJson.derive[GetChatHistoryRequest]
  implicit val GetChatHistoryRequestDecoder: EntityDecoder[GetChatHistoryRequest] = jsonOf[GetChatHistoryRequest]
  implicit val GetChatHistoryRequestEncoder: EntityEncoder[GetChatHistoryRequest] = jsonEncoderOf[GetChatHistoryRequest]
}
