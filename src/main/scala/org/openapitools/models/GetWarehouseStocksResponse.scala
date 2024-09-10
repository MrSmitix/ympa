package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetWarehouseStocksDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetWarehouseStocksResponse(status: Option[ApiResponseStatusType],
                result: Option[GetWarehouseStocksDTO]
                )

object GetWarehouseStocksResponse {
    /**
     * Creates the codec for converting GetWarehouseStocksResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetWarehouseStocksResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetWarehouseStocksResponse] = deriveEncoder
}
