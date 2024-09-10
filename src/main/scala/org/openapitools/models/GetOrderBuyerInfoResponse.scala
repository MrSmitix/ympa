package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OrderBuyerInfoDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetOrderBuyerInfoResponse(status: Option[ApiResponseStatusType],
                result: Option[OrderBuyerInfoDTO]
                )

object GetOrderBuyerInfoResponse {
    /**
     * Creates the codec for converting GetOrderBuyerInfoResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOrderBuyerInfoResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOrderBuyerInfoResponse] = deriveEncoder
}
