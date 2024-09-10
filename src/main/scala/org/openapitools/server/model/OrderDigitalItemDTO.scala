package org.openapitools.server.model

import java.time.LocalDate

/**
 * Ключ цифрового товара.
 *
 * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  for example: ''null''
 * @param code Сам ключ. for example: ''null''
 * @param slip Инструкция по активации. for example: ''null''
 * @param activateTill Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`.  for example: ''null''
*/
final case class OrderDigitalItemDTO (
  id: Long,
  code: String,
  slip: String,
  activateTill: LocalDate
)

