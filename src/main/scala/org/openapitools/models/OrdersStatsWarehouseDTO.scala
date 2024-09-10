package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о складе, на котором хранится товар.
 * @param id Идентификатор склада.
 * @param name Название склада.
 */
case class OrdersStatsWarehouseDTO(id: Option[Long],
                name: Option[String]
                )

object OrdersStatsWarehouseDTO {
    /**
     * Creates the codec for converting OrdersStatsWarehouseDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsWarehouseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsWarehouseDTO] = deriveEncoder
}
