package model

import play.api.libs.json._

/**
  * Запрос на обновление состава заказа.
  * @param items Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOrderItemRequest(
  items: List[OrderItemModificationDTO],
  reason: Option[OrderItemsModificationRequestReasonType]
)

object UpdateOrderItemRequest {
  implicit lazy val updateOrderItemRequestJsonFormat: Format[UpdateOrderItemRequest] = Json.format[UpdateOrderItemRequest]
}

