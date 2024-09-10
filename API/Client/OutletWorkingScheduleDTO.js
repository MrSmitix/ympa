goog.provide('API.Client.OutletWorkingScheduleDTO');

/**
 * Список режимов работы точки продаж. 
 * @record
 */
API.Client.OutletWorkingScheduleDTO = function() {}

/**
 * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
 * @type {!boolean}
 * @export
 */
API.Client.OutletWorkingScheduleDTO.prototype.workInHoliday;

/**
 * Список расписаний работы точки продаж. 
 * @type {!Array<!API.Client.OutletWorkingScheduleItemDTO>}
 * @export
 */
API.Client.OutletWorkingScheduleDTO.prototype.scheduleItems;

