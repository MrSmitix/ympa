package model

import play.api.libs.json._

/**
  * Список чатов.
  * @param chats Информация о чатах.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetChatsInfoDTO(
  chats: List[GetChatInfoDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object GetChatsInfoDTO {
  implicit lazy val getChatsInfoDTOJsonFormat: Format[GetChatsInfoDTO] = Json.format[GetChatsInfoDTO]
}

