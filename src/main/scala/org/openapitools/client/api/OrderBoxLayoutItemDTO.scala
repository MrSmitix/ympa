package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBoxLayoutItemDTO._

case class OrderBoxLayoutItemDTO (
  /* Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}    */
  id: Long,
/* Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.  */
  fullCount: Option[Integer],
partialCount: Option[OrderBoxLayoutPartialCountDTO],
/* Переданные вами коды маркировки. */
  instances: Option[List[BriefOrderItemInstanceDTO]])

object OrderBoxLayoutItemDTO {
  import DateTimeCodecs._

  implicit val OrderBoxLayoutItemDTOCodecJson: CodecJson[OrderBoxLayoutItemDTO] = CodecJson.derive[OrderBoxLayoutItemDTO]
  implicit val OrderBoxLayoutItemDTODecoder: EntityDecoder[OrderBoxLayoutItemDTO] = jsonOf[OrderBoxLayoutItemDTO]
  implicit val OrderBoxLayoutItemDTOEncoder: EntityEncoder[OrderBoxLayoutItemDTO] = jsonEncoderOf[OrderBoxLayoutItemDTO]
}
