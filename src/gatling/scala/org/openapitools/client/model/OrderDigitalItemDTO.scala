
package org.openapitools.client.model

import java.time.LocalDate

case class OrderDigitalItemDTO (
    /* Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  */
    _id: Long,
    /* Сам ключ. */
    _code: String,
    /* Инструкция по активации. */
    _slip: String,
    /* Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`.  */
    _activateTill: LocalDate
)
object OrderDigitalItemDTO {
    def toStringBody(var_id: Object, var_code: Object, var_slip: Object, var_activateTill: Object) =
        s"""
        | {
        | "id":$var_id,"code":$var_code,"slip":$var_slip,"activateTill":$var_activateTill
        | }
        """.stripMargin
}
