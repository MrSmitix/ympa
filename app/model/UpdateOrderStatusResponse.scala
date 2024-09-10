package model

import play.api.libs.json._

/**
  * Информация об изменении статуса заказа.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOrderStatusResponse(
  order: Option[OrderDTO]
)

object UpdateOrderStatusResponse {
  implicit lazy val updateOrderStatusResponseJsonFormat: Format[UpdateOrderStatusResponse] = Json.format[UpdateOrderStatusResponse]
}

