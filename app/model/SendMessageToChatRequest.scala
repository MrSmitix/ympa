package model

import play.api.libs.json._

/**
  * В какой чат нужно отправить сообщение и текст сообщения.
  * @param message Текст сообщения. Максимальная длина — 4096 символа.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SendMessageToChatRequest(
  message: String
)

object SendMessageToChatRequest {
  implicit lazy val sendMessageToChatRequestJsonFormat: Format[SendMessageToChatRequest] = Json.format[SendMessageToChatRequest]
}

