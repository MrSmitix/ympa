package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BriefOrderItemInstanceDTO
import scala.collection.immutable.Seq

/**
 * Позиция в корзине, требующая маркировки.
 * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
 * @param instances Список кодов маркировки единиц товара. 
 */
case class OrderItemInstanceModificationDTO(id: Long,
                instances: Seq[BriefOrderItemInstanceDTO]
                )

object OrderItemInstanceModificationDTO {
    /**
     * Creates the codec for converting OrderItemInstanceModificationDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemInstanceModificationDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemInstanceModificationDTO] = deriveEncoder
}
