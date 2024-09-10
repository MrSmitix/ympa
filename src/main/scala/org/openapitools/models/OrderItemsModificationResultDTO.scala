package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BriefOrderItemDTO
import scala.collection.immutable.Seq

/**
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
 * @param items Список позиций в заказе, подлежащих маркировке.
 */
case class OrderItemsModificationResultDTO(items: Seq[BriefOrderItemDTO]
                )

object OrderItemsModificationResultDTO {
    /**
     * Creates the codec for converting OrderItemsModificationResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemsModificationResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemsModificationResultDTO] = deriveEncoder
}
