package model

import play.api.libs.json._

/**
  * Список заказов.
  * @param orders Список заказов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOrderStatusesRequest(
  orders: List[OrderStateDTO]
)

object UpdateOrderStatusesRequest {
  implicit lazy val updateOrderStatusesRequestJsonFormat: Format[UpdateOrderStatusesRequest] = Json.format[UpdateOrderStatusesRequest]
}

