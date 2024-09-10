package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.SearchShipmentsResponseDTO

/**
 * Ответ на запрос информации об отгрузках.
 * @param status 
 * @param result 
 */
case class SearchShipmentsResponse(status: Option[ApiResponseStatusType],
                result: Option[SearchShipmentsResponseDTO]
                )

object SearchShipmentsResponse {
    /**
     * Creates the codec for converting SearchShipmentsResponse from and to JSON.
     */
    implicit val decoder: Decoder[SearchShipmentsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SearchShipmentsResponse] = deriveEncoder
}
