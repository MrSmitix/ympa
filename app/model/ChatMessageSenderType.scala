package model

import play.api.libs.json._

/**
  * Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ChatMessageSenderType(
)

object ChatMessageSenderType {
  implicit lazy val chatMessageSenderTypeJsonFormat: Format[ChatMessageSenderType] = Json.format[ChatMessageSenderType]
}

