package model

import play.api.libs.json._

/**
  * Фильтры по чатам, которые нужно вернуть. 
  * @param orderIds Фильтр по идентификаторам заказов на Маркете.
  * @param types Фильтр по типам чатов.
  * @param statuses Фильтр по статусам чатов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetChatsRequest(
  orderIds: Option[List[Long]],
  types: Option[List[ChatType]],
  statuses: Option[List[ChatStatusType]]
)

object GetChatsRequest {
  implicit lazy val getChatsRequestJsonFormat: Format[GetChatsRequest] = Json.format[GetChatsRequest]
}

