package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OrderBusinessBuyerDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetBusinessBuyerInfoResponse(status: Option[ApiResponseStatusType],
                result: Option[OrderBusinessBuyerDTO]
                )

object GetBusinessBuyerInfoResponse {
    /**
     * Creates the codec for converting GetBusinessBuyerInfoResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessBuyerInfoResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessBuyerInfoResponse] = deriveEncoder
}
