
package org.openapitools.client.model

import java.time.OffsetDateTime

case class GetChatInfoDTO (
    /* Идентификатор чата. */
    _chatId: Long,
    /* Идентификатор заказа. */
    _orderId: Long,
    _type: ChatType,
    _status: ChatStatusType,
    /* Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    _createdAt: OffsetDateTime,
    /* Дата и время последнего сообщения в чате. */
    _updatedAt: OffsetDateTime
)
object GetChatInfoDTO {
    def toStringBody(var_chatId: Object, var_orderId: Object, var_type: Object, var_status: Object, var_createdAt: Object, var_updatedAt: Object) =
        s"""
        | {
        | "chatId":$var_chatId,"orderId":$var_orderId,"type":$var_type,"status":$var_status,"createdAt":$var_createdAt,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
