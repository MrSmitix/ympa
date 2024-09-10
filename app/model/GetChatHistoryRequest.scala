package model

import play.api.libs.json._

/**
  * Историю какого чата нужно получить — и начиная с какого сообщения. 
  * @param messageIdFrom Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetChatHistoryRequest(
  messageIdFrom: Option[Long]
)

object GetChatHistoryRequest {
  implicit lazy val getChatHistoryRequestJsonFormat: Format[GetChatHistoryRequest] = Json.format[GetChatHistoryRequest]
}

