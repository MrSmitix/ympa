package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BriefOrderItemInstanceDTO
import org.openapitools.models.OrderBoxLayoutPartialCountDTO
import scala.collection.immutable.Seq

/**
 * Информация о товаре в коробке.
 * @param id Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
 * @param fullCount Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
 * @param partialCount 
 * @param instances Переданные вами коды маркировки.
 */
case class OrderBoxLayoutItemDTO(id: Long,
                fullCount: Option[Int],
                partialCount: Option[OrderBoxLayoutPartialCountDTO],
                instances: Option[Seq[BriefOrderItemInstanceDTO]]
                )

object OrderBoxLayoutItemDTO {
    /**
     * Creates the codec for converting OrderBoxLayoutItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBoxLayoutItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBoxLayoutItemDTO] = deriveEncoder
}
