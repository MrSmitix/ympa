package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import OrderDigitalItemDTO._

case class OrderDigitalItemDTO (
  /* Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  */
  id: Long,
/* Сам ключ. */
  code: String,
/* Инструкция по активации. */
  slip: String,
/* Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`.  */
  activateTill: LocalDate)

object OrderDigitalItemDTO {
  import DateTimeCodecs._

  implicit val OrderDigitalItemDTOCodecJson: CodecJson[OrderDigitalItemDTO] = CodecJson.derive[OrderDigitalItemDTO]
  implicit val OrderDigitalItemDTODecoder: EntityDecoder[OrderDigitalItemDTO] = jsonOf[OrderDigitalItemDTO]
  implicit val OrderDigitalItemDTOEncoder: EntityEncoder[OrderDigitalItemDTO] = jsonEncoderOf[OrderDigitalItemDTO]
}
