package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OrdersStatsDTO

/**
 * Ответ на запрос информации по заказам.
 * @param status 
 * @param result 
 */
case class GetOrdersStatsResponse(status: Option[ApiResponseStatusType],
                result: Option[OrdersStatsDTO]
                )

object GetOrdersStatsResponse {
    /**
     * Creates the codec for converting GetOrdersStatsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOrdersStatsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOrdersStatsResponse] = deriveEncoder
}
