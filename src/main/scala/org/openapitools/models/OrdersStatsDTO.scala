package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.OrdersStatsOrderDTO
import scala.collection.immutable.Seq

/**
 * Информация по заказам.
 * @param orders Список заказов.
 * @param paging 
 */
case class OrdersStatsDTO(orders: Seq[OrdersStatsOrderDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object OrdersStatsDTO {
    /**
     * Creates the codec for converting OrdersStatsDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsDTO] = deriveEncoder
}
