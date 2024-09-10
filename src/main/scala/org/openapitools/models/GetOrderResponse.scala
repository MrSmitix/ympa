package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderDTO

/**
 * 
 * @param order 
 */
case class GetOrderResponse(order: Option[OrderDTO]
                )

object GetOrderResponse {
    /**
     * Creates the codec for converting GetOrderResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOrderResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOrderResponse] = deriveEncoder
}
