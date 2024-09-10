package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderDeliveryDateDTO
import org.openapitools.models.OrderDeliveryDateReasonType

/**
 * 
 * @param dates 
 * @param reason 
 */
case class SetOrderDeliveryDateRequest(dates: OrderDeliveryDateDTO,
                reason: OrderDeliveryDateReasonType
                )

object SetOrderDeliveryDateRequest {
    /**
     * Creates the codec for converting SetOrderDeliveryDateRequest from and to JSON.
     */
    implicit val decoder: Decoder[SetOrderDeliveryDateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetOrderDeliveryDateRequest] = deriveEncoder
}
