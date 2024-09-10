package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация о чатах.
 *
 * @param chatId Идентификатор чата. for example: ''null''
 * @param orderId Идентификатор заказа. for example: ''null''
 * @param `type`  for example: ''null''
 * @param status  for example: ''null''
 * @param createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  for example: ''null''
 * @param updatedAt Дата и время последнего сообщения в чате. for example: ''null''
*/
final case class GetChatInfoDTO (
  chatId: Long,
  orderId: Long,
  `type`: ChatType,
  status: ChatStatusType,
  createdAt: OffsetDateTime,
  updatedAt: OffsetDateTime
)

