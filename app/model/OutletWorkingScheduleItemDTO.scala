package model

import play.api.libs.json._

/**
  * Расписание работы точки продаж.
  * @param startTime Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
  * @param endTime Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OutletWorkingScheduleItemDTO(
  startDay: DayOfWeekType,
  endDay: DayOfWeekType,
  startTime: String,
  endTime: String
)

object OutletWorkingScheduleItemDTO {
  implicit lazy val outletWorkingScheduleItemDTOJsonFormat: Format[OutletWorkingScheduleItemDTO] = Json.format[OutletWorkingScheduleItemDTO]
}

