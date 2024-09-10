package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Диапазон дат доставки.
 * @param fromDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param toDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param fromTime Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
 * @param toTime Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
 * @param realDeliveryDate Формат даты: `ДД-ММ-ГГГГ`. 
 */
case class OrderDeliveryDatesDTO(fromDate: Option[String],
                toDate: Option[String],
                fromTime: Option[String],
                toTime: Option[String],
                realDeliveryDate: Option[String]
                )

object OrderDeliveryDatesDTO {
    /**
     * Creates the codec for converting OrderDeliveryDatesDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderDeliveryDatesDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDeliveryDatesDTO] = deriveEncoder
}
