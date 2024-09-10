package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Информация о сообщениях.
  * @param messageId Идентификатор сообщения.
  * @param createdAt Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  * @param message Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
  * @param payload Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ChatMessageDTO(
  messageId: Long,
  createdAt: OffsetDateTime,
  sender: ChatMessageSenderType,
  message: Option[String],
  payload: Option[List[ChatMessagePayloadDTO]]
)

object ChatMessageDTO {
  implicit lazy val chatMessageDTOJsonFormat: Format[ChatMessageDTO] = Json.format[ChatMessageDTO]
}

