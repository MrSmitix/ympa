package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Ключ цифрового товара.
  * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  * @param code Сам ключ.
  * @param slip Инструкция по активации.
  * @param activateTill Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderDigitalItemDTO(
  id: Long,
  code: String,
  slip: String,
  activateTill: LocalDate
)

object OrderDigitalItemDTO {
  implicit lazy val orderDigitalItemDTOJsonFormat: Format[OrderDigitalItemDTO] = Json.format[OrderDigitalItemDTO]
}

