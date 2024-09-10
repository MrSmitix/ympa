
package org.openapitools.client.model

import java.time.OffsetDateTime

case class ChatMessageDTO (
    /* Идентификатор сообщения. */
    _messageId: Long,
    /* Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    _createdAt: OffsetDateTime,
    _sender: ChatMessageSenderType,
    /* Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.  */
    _message: Option[String],
    /* Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.  */
    _payload: Option[List[ChatMessagePayloadDTO]]
)
object ChatMessageDTO {
    def toStringBody(var_messageId: Object, var_createdAt: Object, var_sender: Object, var_message: Object, var_payload: Object) =
        s"""
        | {
        | "messageId":$var_messageId,"createdAt":$var_createdAt,"sender":$var_sender,"message":$var_message,"payload":$var_payload
        | }
        """.stripMargin
}
