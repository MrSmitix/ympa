package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatMessagesResultDTO._

case class ChatMessagesResultDTO (
  /* Идентификатор заказа. */
  orderId: Long,
/* Информация о сообщениях. */
  messages: List[ChatMessageDTO],
paging: Option[ForwardScrollingPagerDTO])

object ChatMessagesResultDTO {
  import DateTimeCodecs._

  implicit val ChatMessagesResultDTOCodecJson: CodecJson[ChatMessagesResultDTO] = CodecJson.derive[ChatMessagesResultDTO]
  implicit val ChatMessagesResultDTODecoder: EntityDecoder[ChatMessagesResultDTO] = jsonOf[ChatMessagesResultDTO]
  implicit val ChatMessagesResultDTOEncoder: EntityEncoder[ChatMessagesResultDTO] = jsonEncoderOf[ChatMessagesResultDTO]
}
