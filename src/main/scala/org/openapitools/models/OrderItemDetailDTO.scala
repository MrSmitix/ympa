package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderItemStatusType

/**
 * Детали по товару в заказе.
 * @param itemCount Количество единиц товара.
 * @param itemStatus 
 * @param updateDate Формат даты: `ДД-ММ-ГГГГ`. 
 */
case class OrderItemDetailDTO(itemCount: Option[Long],
                itemStatus: Option[OrderItemStatusType],
                updateDate: Option[String]
                )

object OrderItemDetailDTO {
    /**
     * Creates the codec for converting OrderItemDetailDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemDetailDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemDetailDTO] = deriveEncoder
}
