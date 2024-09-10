package model

import play.api.libs.json._

/**
  * Позиция в корзине, требующая маркировки.
  * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  * @param instances Список кодов маркировки единиц товара. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderItemInstanceModificationDTO(
  id: Long,
  instances: List[BriefOrderItemInstanceDTO]
)

object OrderItemInstanceModificationDTO {
  implicit lazy val orderItemInstanceModificationDTOJsonFormat: Format[OrderItemInstanceModificationDTO] = Json.format[OrderItemInstanceModificationDTO]
}

