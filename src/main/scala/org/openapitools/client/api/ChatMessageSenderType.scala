package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatMessageSenderType._

case class ChatMessageSenderType (
  
object ChatMessageSenderType {
  import DateTimeCodecs._

  implicit val ChatMessageSenderTypeCodecJson: CodecJson[ChatMessageSenderType] = CodecJson.derive[ChatMessageSenderType]
  implicit val ChatMessageSenderTypeDecoder: EntityDecoder[ChatMessageSenderType] = jsonOf[ChatMessageSenderType]
  implicit val ChatMessageSenderTypeEncoder: EntityEncoder[ChatMessageSenderType] = jsonEncoderOf[ChatMessageSenderType]
}
