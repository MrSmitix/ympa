package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderDTO

/**
 * Информация об изменении статуса заказа.
 * @param order 
 */
case class UpdateOrderStatusResponse(order: Option[OrderDTO]
                )

object UpdateOrderStatusResponse {
    /**
     * Creates the codec for converting UpdateOrderStatusResponse from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOrderStatusResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOrderStatusResponse] = deriveEncoder
}
