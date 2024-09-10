package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация о сообщениях.
 *
 * @param messageId Идентификатор сообщения. for example: ''null''
 * @param createdAt Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  for example: ''null''
 * @param sender  for example: ''null''
 * @param message Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.  for example: ''null''
 * @param payload Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.  for example: ''null''
*/
final case class ChatMessageDTO (
  messageId: Long,
  createdAt: OffsetDateTime,
  sender: ChatMessageSenderType,
  message: Option[String] = None,
  payload: Option[Seq[ChatMessagePayloadDTO]] = None
)

