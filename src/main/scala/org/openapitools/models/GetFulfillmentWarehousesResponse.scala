package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.FulfillmentWarehousesDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetFulfillmentWarehousesResponse(status: Option[ApiResponseStatusType],
                result: Option[FulfillmentWarehousesDTO]
                )

object GetFulfillmentWarehousesResponse {
    /**
     * Creates the codec for converting GetFulfillmentWarehousesResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetFulfillmentWarehousesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetFulfillmentWarehousesResponse] = deriveEncoder
}
