package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.DeliveryServicesDTO

/**
 * Ответ на запрос списка служб доставки.
 * @param result 
 */
case class GetDeliveryServicesResponse(result: Option[DeliveryServicesDTO]
                )

object GetDeliveryServicesResponse {
    /**
     * Creates the codec for converting GetDeliveryServicesResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetDeliveryServicesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetDeliveryServicesResponse] = deriveEncoder
}
