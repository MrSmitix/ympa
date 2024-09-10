package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderStatusType
import org.openapitools.models.OrderSubstatusType

/**
 * Информация по заказу.
 * @param id Идентификатор заказа.
 * @param status 
 * @param substatus 
 */
case class OrderStateDTO(id: Long,
                status: OrderStatusType,
                substatus: Option[OrderSubstatusType]
                )

object OrderStateDTO {
    /**
     * Creates the codec for converting OrderStateDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderStateDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderStateDTO] = deriveEncoder
}
