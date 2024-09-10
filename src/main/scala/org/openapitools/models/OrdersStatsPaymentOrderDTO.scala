package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime

/**
 * Информация о платежном получении.
 * @param id Номер платежного поручения.
 * @param date Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 */
case class OrdersStatsPaymentOrderDTO(id: Option[String],
                date: Option[LocalDateTime]
                )

object OrdersStatsPaymentOrderDTO {
    /**
     * Creates the codec for converting OrdersStatsPaymentOrderDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsPaymentOrderDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsPaymentOrderDTO] = deriveEncoder
}
