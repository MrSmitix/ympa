package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.DayOfWeekType

/**
 * Расписание работы точки продаж.
 * @param startDay 
 * @param endDay 
 * @param startTime Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
 * @param endTime Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
 */
case class OutletWorkingScheduleItemDTO(startDay: DayOfWeekType,
                endDay: DayOfWeekType,
                startTime: String,
                endTime: String
                )

object OutletWorkingScheduleItemDTO {
    /**
     * Creates the codec for converting OutletWorkingScheduleItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[OutletWorkingScheduleItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OutletWorkingScheduleItemDTO] = deriveEncoder
}
