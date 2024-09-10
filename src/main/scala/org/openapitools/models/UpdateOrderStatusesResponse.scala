package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.UpdateOrderStatusesDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class UpdateOrderStatusesResponse(status: Option[ApiResponseStatusType],
                result: Option[UpdateOrderStatusesDTO]
                )

object UpdateOrderStatusesResponse {
    /**
     * Creates the codec for converting UpdateOrderStatusesResponse from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOrderStatusesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOrderStatusesResponse] = deriveEncoder
}
