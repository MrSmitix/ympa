package model

import play.api.libs.json._

/**
  * Информация о товаре в коробке.
  * @param id Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
  * @param fullCount Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
  * @param instances Переданные вами коды маркировки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBoxLayoutItemDTO(
  id: Long,
  fullCount: Option[Int],
  partialCount: Option[OrderBoxLayoutPartialCountDTO],
  instances: Option[List[BriefOrderItemInstanceDTO]]
)

object OrderBoxLayoutItemDTO {
  implicit lazy val orderBoxLayoutItemDTOJsonFormat: Format[OrderBoxLayoutItemDTO] = Json.format[OrderBoxLayoutItemDTO]
}

