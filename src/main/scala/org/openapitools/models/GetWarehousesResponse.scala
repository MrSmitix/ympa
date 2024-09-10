package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.WarehousesDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetWarehousesResponse(status: Option[ApiResponseStatusType],
                result: Option[WarehousesDTO]
                )

object GetWarehousesResponse {
    /**
     * Creates the codec for converting GetWarehousesResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetWarehousesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetWarehousesResponse] = deriveEncoder
}
