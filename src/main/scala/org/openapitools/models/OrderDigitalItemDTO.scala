package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime

/**
 * Ключ цифрового товара.
 * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
 * @param code Сам ключ.
 * @param slip Инструкция по активации.
 * @param activateUnderscoretill Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
 */
case class OrderDigitalItemDTO(id: Long,
                code: String,
                slip: String,
                activateUnderscoretill: LocalDateTime
                )

object OrderDigitalItemDTO {
    /**
     * Creates the codec for converting OrderDigitalItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderDigitalItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDigitalItemDTO] = deriveEncoder
}
