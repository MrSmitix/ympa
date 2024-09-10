package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.ShipmentBoxesDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class SetOrderShipmentBoxesResponse(status: Option[ApiResponseStatusType],
                result: Option[ShipmentBoxesDTO]
                )

object SetOrderShipmentBoxesResponse {
    /**
     * Creates the codec for converting SetOrderShipmentBoxesResponse from and to JSON.
     */
    implicit val decoder: Decoder[SetOrderShipmentBoxesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetOrderShipmentBoxesResponse] = deriveEncoder
}
