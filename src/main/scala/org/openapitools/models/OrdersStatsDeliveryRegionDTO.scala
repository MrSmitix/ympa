package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о регионе доставки.
 * @param id Идентификатор региона доставки.
 * @param name Название региона доставки.
 */
case class OrdersStatsDeliveryRegionDTO(id: Option[Long],
                name: Option[String]
                )

object OrdersStatsDeliveryRegionDTO {
    /**
     * Creates the codec for converting OrdersStatsDeliveryRegionDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsDeliveryRegionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsDeliveryRegionDTO] = deriveEncoder
}
