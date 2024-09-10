package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderStatusType
import org.openapitools.models.OrderSubstatusType
import org.openapitools.models.OrderUpdateStatusType

/**
 * Список заказов.
 * @param id Идентификатор заказа.
 * @param status 
 * @param substatus 
 * @param updateStatus 
 * @param errorDetails Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
 */
case class UpdateOrderStatusDTO(id: Option[Long],
                status: Option[OrderStatusType],
                substatus: Option[OrderSubstatusType],
                updateStatus: Option[OrderUpdateStatusType],
                errorDetails: Option[String]
                )

object UpdateOrderStatusDTO {
    /**
     * Creates the codec for converting UpdateOrderStatusDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOrderStatusDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOrderStatusDTO] = deriveEncoder
}
