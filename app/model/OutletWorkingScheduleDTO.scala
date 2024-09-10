package model

import play.api.libs.json._

/**
  * Список режимов работы точки продаж. 
  * @param workInHoliday Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
  * @param scheduleItems Список расписаний работы точки продаж. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OutletWorkingScheduleDTO(
  workInHoliday: Option[Boolean],
  scheduleItems: List[OutletWorkingScheduleItemDTO]
)

object OutletWorkingScheduleDTO {
  implicit lazy val outletWorkingScheduleDTOJsonFormat: Format[OutletWorkingScheduleDTO] = Json.format[OutletWorkingScheduleDTO]
}

