package model

import play.api.libs.json._

/**
  * Информация о сообщениях.
  * @param orderId Идентификатор заказа.
  * @param messages Информация о сообщениях.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ChatMessagesResultDTO(
  orderId: Long,
  messages: List[ChatMessageDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object ChatMessagesResultDTO {
  implicit lazy val chatMessagesResultDTOJsonFormat: Format[ChatMessagesResultDTO] = Json.format[ChatMessagesResultDTO]
}

