package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderStatusChangeDTO

/**
 * 
 * @param order 
 */
case class UpdateOrderStatusRequest(order: OrderStatusChangeDTO
                )

object UpdateOrderStatusRequest {
    /**
     * Creates the codec for converting UpdateOrderStatusRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOrderStatusRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOrderStatusRequest] = deriveEncoder
}
