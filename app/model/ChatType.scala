package model

import play.api.libs.json._

/**
  * Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ChatType(
)

object ChatType {
  implicit lazy val chatTypeJsonFormat: Format[ChatType] = Json.format[ChatType]
}

