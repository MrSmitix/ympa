package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderStatusChangeDeliveryDTO
import org.openapitools.models.OrderStatusType
import org.openapitools.models.OrderSubstatusType

/**
 * Заказ.
 * @param status 
 * @param substatus 
 * @param delivery 
 */
case class OrderStatusChangeDTO(status: OrderStatusType,
                substatus: Option[OrderSubstatusType],
                delivery: Option[OrderStatusChangeDeliveryDTO]
                )

object OrderStatusChangeDTO {
    /**
     * Creates the codec for converting OrderStatusChangeDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderStatusChangeDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderStatusChangeDTO] = deriveEncoder
}
