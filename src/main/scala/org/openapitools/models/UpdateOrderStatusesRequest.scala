package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderStateDTO
import scala.collection.immutable.Seq

/**
 * Список заказов.
 * @param orders Список заказов.
 */
case class UpdateOrderStatusesRequest(orders: Seq[OrderStateDTO]
                )

object UpdateOrderStatusesRequest {
    /**
     * Creates the codec for converting UpdateOrderStatusesRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOrderStatusesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOrderStatusesRequest] = deriveEncoder
}
