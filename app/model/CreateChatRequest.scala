package model

import play.api.libs.json._

/**
  * Заказ, для которого нужно создать чат. 
  * @param orderId Идентификатор заказа на Маркете.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CreateChatRequest(
  orderId: Long
)

object CreateChatRequest {
  implicit lazy val createChatRequestJsonFormat: Format[CreateChatRequest] = Json.format[CreateChatRequest]
}

