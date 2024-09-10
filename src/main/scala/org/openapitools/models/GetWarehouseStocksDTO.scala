package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ScrollingPagerDTO
import org.openapitools.models.WarehouseOffersDTO
import scala.collection.immutable.Seq

/**
 * Список складов с информацией об остатках на каждом из них.
 * @param paging 
 * @param warehouses Страница списка складов.
 */
case class GetWarehouseStocksDTO(paging: Option[ScrollingPagerDTO],
                warehouses: Seq[WarehouseOffersDTO]
                )

object GetWarehouseStocksDTO {
    /**
     * Creates the codec for converting GetWarehouseStocksDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetWarehouseStocksDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetWarehouseStocksDTO] = deriveEncoder
}
