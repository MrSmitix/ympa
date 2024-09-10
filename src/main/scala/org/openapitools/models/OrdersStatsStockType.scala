package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
 */
case class OrdersStatsStockType()

object OrdersStatsStockType {
    /**
     * Creates the codec for converting OrdersStatsStockType from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsStockType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsStockType] = deriveEncoder
}
