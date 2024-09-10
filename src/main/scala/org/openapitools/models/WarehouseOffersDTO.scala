package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.WarehouseOfferDTO
import scala.collection.immutable.Seq

/**
 * Информация об остатках товаров на складе.
 * @param warehouseId Идентификатор склада.
 * @param offers Информация об остатках.
 */
case class WarehouseOffersDTO(warehouseId: Long,
                offers: Seq[WarehouseOfferDTO]
                )

object WarehouseOffersDTO {
    /**
     * Creates the codec for converting WarehouseOffersDTO from and to JSON.
     */
    implicit val decoder: Decoder[WarehouseOffersDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[WarehouseOffersDTO] = deriveEncoder
}
