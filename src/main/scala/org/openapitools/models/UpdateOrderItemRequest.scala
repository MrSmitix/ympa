package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderItemModificationDTO
import org.openapitools.models.OrderItemsModificationRequestReasonType
import scala.collection.immutable.Seq

/**
 * Запрос на обновление состава заказа.
 * @param items Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 * @param reason 
 */
case class UpdateOrderItemRequest(items: Seq[OrderItemModificationDTO],
                reason: Option[OrderItemsModificationRequestReasonType]
                )

object UpdateOrderItemRequest {
    /**
     * Creates the codec for converting UpdateOrderItemRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOrderItemRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOrderItemRequest] = deriveEncoder
}
