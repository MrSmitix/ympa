package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.ShipmentDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetShipmentResponse(status: Option[ApiResponseStatusType],
                result: Option[ShipmentDTO]
                )

object GetShipmentResponse {
    /**
     * Creates the codec for converting GetShipmentResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetShipmentResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetShipmentResponse] = deriveEncoder
}
