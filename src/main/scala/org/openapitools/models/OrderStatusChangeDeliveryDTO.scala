package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderStatusChangeDeliveryDatesDTO

/**
 * Информация о доставке.
 * @param dates 
 */
case class OrderStatusChangeDeliveryDTO(dates: Option[OrderStatusChangeDeliveryDatesDTO]
                )

object OrderStatusChangeDeliveryDTO {
    /**
     * Creates the codec for converting OrderStatusChangeDeliveryDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderStatusChangeDeliveryDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderStatusChangeDeliveryDTO] = deriveEncoder
}
