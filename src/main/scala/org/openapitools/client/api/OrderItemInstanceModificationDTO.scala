package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemInstanceModificationDTO._

case class OrderItemInstanceModificationDTO (
  /* Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  */
  id: Long,
/* Список кодов маркировки единиц товара.  */
  instances: List[BriefOrderItemInstanceDTO])

object OrderItemInstanceModificationDTO {
  import DateTimeCodecs._

  implicit val OrderItemInstanceModificationDTOCodecJson: CodecJson[OrderItemInstanceModificationDTO] = CodecJson.derive[OrderItemInstanceModificationDTO]
  implicit val OrderItemInstanceModificationDTODecoder: EntityDecoder[OrderItemInstanceModificationDTO] = jsonOf[OrderItemInstanceModificationDTO]
  implicit val OrderItemInstanceModificationDTOEncoder: EntityEncoder[OrderItemInstanceModificationDTO] = jsonEncoderOf[OrderItemInstanceModificationDTO]
}
