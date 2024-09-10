package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.WarehouseStockType

/**
 * Информация об остатках товара.
 * @param _type 
 * @param count Значение остатков.
 */
case class WarehouseStockDTO(_type: WarehouseStockType,
                count: Long
                )

object WarehouseStockDTO {
    /**
     * Creates the codec for converting WarehouseStockDTO from and to JSON.
     */
    implicit val decoder: Decoder[WarehouseStockDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[WarehouseStockDTO] = deriveEncoder
}
