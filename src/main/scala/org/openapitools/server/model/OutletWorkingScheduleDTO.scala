package org.openapitools.server.model


/**
 * Список режимов работы точки продаж. 
 *
 * @param workInHoliday Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников.  for example: ''null''
 * @param scheduleItems Список расписаний работы точки продаж.  for example: ''null''
*/
final case class OutletWorkingScheduleDTO (
  workInHoliday: Option[Boolean] = None,
  scheduleItems: Seq[OutletWorkingScheduleItemDTO]
)

