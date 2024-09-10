package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.WarehouseStockDTO
import scala.collection.immutable.Seq

/**
 * Информация о складе.
 * @param id Идентификатор склада.
 * @param name Название склада.
 * @param stocks Информация об остатках товаров на складе.
 */
case class GoodsStatsWarehouseDTO(id: Option[Long],
                name: Option[String],
                stocks: Seq[WarehouseStockDTO]
                )

object GoodsStatsWarehouseDTO {
    /**
     * Creates the codec for converting GoodsStatsWarehouseDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsStatsWarehouseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsStatsWarehouseDTO] = deriveEncoder
}
