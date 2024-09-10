package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OutletWorkingScheduleItemDTO
import scala.collection.immutable.Seq

/**
 * Список режимов работы точки продаж. 
 * @param workInHoliday Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
 * @param scheduleItems Список расписаний работы точки продаж. 
 */
case class OutletWorkingScheduleDTO(workInHoliday: Option[Boolean],
                scheduleItems: Seq[OutletWorkingScheduleItemDTO]
                )

object OutletWorkingScheduleDTO {
    /**
     * Creates the codec for converting OutletWorkingScheduleDTO from and to JSON.
     */
    implicit val decoder: Decoder[OutletWorkingScheduleDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OutletWorkingScheduleDTO] = deriveEncoder
}
