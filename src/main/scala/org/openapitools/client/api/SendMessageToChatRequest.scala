package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SendMessageToChatRequest._

case class SendMessageToChatRequest (
  /* Текст сообщения. Максимальная длина — 4096 символа. */
  message: String)

object SendMessageToChatRequest {
  import DateTimeCodecs._

  implicit val SendMessageToChatRequestCodecJson: CodecJson[SendMessageToChatRequest] = CodecJson.derive[SendMessageToChatRequest]
  implicit val SendMessageToChatRequestDecoder: EntityDecoder[SendMessageToChatRequest] = jsonOf[SendMessageToChatRequest]
  implicit val SendMessageToChatRequestEncoder: EntityEncoder[SendMessageToChatRequest] = jsonEncoderOf[SendMessageToChatRequest]
}
