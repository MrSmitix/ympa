package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BriefOrderItemInstanceDTO
import scala.collection.immutable.Seq

/**
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 * @param id Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
 * @param count Новое количество товара.
 * @param instances Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
 */
case class OrderItemModificationDTO(id: Long,
                count: Int,
                instances: Option[Seq[BriefOrderItemInstanceDTO]]
                )

object OrderItemModificationDTO {
    /**
     * Creates the codec for converting OrderItemModificationDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemModificationDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemModificationDTO] = deriveEncoder
}
