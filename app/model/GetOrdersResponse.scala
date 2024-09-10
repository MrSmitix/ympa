package model

import play.api.libs.json._

/**
  * Модель для ответа API списка информации по заказам.
  * @param orders Модель заказа. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOrdersResponse(
  pager: Option[FlippingPagerDTO],
  orders: List[OrderDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object GetOrdersResponse {
  implicit lazy val getOrdersResponseJsonFormat: Format[GetOrdersResponse] = Json.format[GetOrdersResponse]
}

