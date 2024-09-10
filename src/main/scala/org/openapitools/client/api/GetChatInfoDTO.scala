package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import GetChatInfoDTO._

case class GetChatInfoDTO (
  /* Идентификатор чата. */
  chatId: Long,
/* Идентификатор заказа. */
  orderId: Long,
`type`: ChatType,
status: ChatStatusType,
/* Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  createdAt: OffsetDateTime,
/* Дата и время последнего сообщения в чате. */
  updatedAt: OffsetDateTime)

object GetChatInfoDTO {
  import DateTimeCodecs._

  implicit val GetChatInfoDTOCodecJson: CodecJson[GetChatInfoDTO] = CodecJson.derive[GetChatInfoDTO]
  implicit val GetChatInfoDTODecoder: EntityDecoder[GetChatInfoDTO] = jsonOf[GetChatInfoDTO]
  implicit val GetChatInfoDTOEncoder: EntityEncoder[GetChatInfoDTO] = jsonEncoderOf[GetChatInfoDTO]
}
