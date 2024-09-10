package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OrdersShipmentInfoDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetShipmentOrdersInfoResponse(status: Option[ApiResponseStatusType],
                result: Option[OrdersShipmentInfoDTO]
                )

object GetShipmentOrdersInfoResponse {
    /**
     * Creates the codec for converting GetShipmentOrdersInfoResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetShipmentOrdersInfoResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetShipmentOrdersInfoResponse] = deriveEncoder
}
