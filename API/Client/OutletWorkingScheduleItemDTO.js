goog.provide('API.Client.OutletWorkingScheduleItemDTO');

/**
 * Расписание работы точки продаж.
 * @record
 */
API.Client.OutletWorkingScheduleItemDTO = function() {}

/**
 * @type {!API.Client.DayOfWeekType}
 * @export
 */
API.Client.OutletWorkingScheduleItemDTO.prototype.startDay;

/**
 * @type {!API.Client.DayOfWeekType}
 * @export
 */
API.Client.OutletWorkingScheduleItemDTO.prototype.endDay;

/**
 * Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
 * @type {!string}
 * @export
 */
API.Client.OutletWorkingScheduleItemDTO.prototype.startTime;

/**
 * Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
 * @type {!string}
 * @export
 */
API.Client.OutletWorkingScheduleItemDTO.prototype.endTime;

