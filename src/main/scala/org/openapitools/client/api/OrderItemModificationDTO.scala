package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemModificationDTO._

case class OrderItemModificationDTO (
  /* Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  */
  id: Long,
/* Новое количество товара. */
  count: Integer,
/* Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  */
  instances: Option[List[BriefOrderItemInstanceDTO]])

object OrderItemModificationDTO {
  import DateTimeCodecs._

  implicit val OrderItemModificationDTOCodecJson: CodecJson[OrderItemModificationDTO] = CodecJson.derive[OrderItemModificationDTO]
  implicit val OrderItemModificationDTODecoder: EntityDecoder[OrderItemModificationDTO] = jsonOf[OrderItemModificationDTO]
  implicit val OrderItemModificationDTOEncoder: EntityEncoder[OrderItemModificationDTO] = jsonEncoderOf[OrderItemModificationDTO]
}
