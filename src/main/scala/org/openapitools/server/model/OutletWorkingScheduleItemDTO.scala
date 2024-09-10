package org.openapitools.server.model


/**
 * Расписание работы точки продаж.
 *
 * @param startDay  for example: ''null''
 * @param endDay  for example: ''null''
 * @param startTime Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`.  for example: ''null''
 * @param endTime Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`.  for example: ''null''
*/
final case class OutletWorkingScheduleItemDTO (
  startDay: DayOfWeekType,
  endDay: DayOfWeekType,
  startTime: String,
  endTime: String
)

