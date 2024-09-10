package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Информация о чатах.
  * @param chatId Идентификатор чата.
  * @param orderId Идентификатор заказа.
  * @param createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  * @param updatedAt Дата и время последнего сообщения в чате.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetChatInfoDTO(
  chatId: Long,
  orderId: Long,
  `type`: ChatType,
  status: ChatStatusType,
  createdAt: OffsetDateTime,
  updatedAt: OffsetDateTime
)

object GetChatInfoDTO {
  implicit lazy val getChatInfoDTOJsonFormat: Format[GetChatInfoDTO] = Json.format[GetChatInfoDTO]
}

