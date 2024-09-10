package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import ChatMessageDTO._

case class ChatMessageDTO (
  /* Идентификатор сообщения. */
  messageId: Long,
/* Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  createdAt: OffsetDateTime,
sender: ChatMessageSenderType,
/* Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.  */
  message: Option[String],
/* Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.  */
  payload: Option[List[ChatMessagePayloadDTO]])

object ChatMessageDTO {
  import DateTimeCodecs._

  implicit val ChatMessageDTOCodecJson: CodecJson[ChatMessageDTO] = CodecJson.derive[ChatMessageDTO]
  implicit val ChatMessageDTODecoder: EntityDecoder[ChatMessageDTO] = jsonOf[ChatMessageDTO]
  implicit val ChatMessageDTOEncoder: EntityEncoder[ChatMessageDTO] = jsonEncoderOf[ChatMessageDTO]
}
