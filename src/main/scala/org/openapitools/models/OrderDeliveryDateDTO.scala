package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime

/**
 * Информация о новой дате доставки заказа.
 * @param toDate Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
 */
case class OrderDeliveryDateDTO(toDate: LocalDateTime
                )

object OrderDeliveryDateDTO {
    /**
     * Creates the codec for converting OrderDeliveryDateDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderDeliveryDateDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDeliveryDateDTO] = deriveEncoder
}
