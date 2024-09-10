goog.provide('API.Client.TimePeriodDTO');

/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 * @record
 */
API.Client.TimePeriodDTO = function() {}

/**
 * Продолжительность в указанных единицах.
 * @type {!number}
 * @export
 */
API.Client.TimePeriodDTO.prototype.timePeriod;

/**
 * @type {!API.Client.TimeUnitType}
 * @export
 */
API.Client.TimePeriodDTO.prototype.timeUnit;

/**
 * Комментарий.
 * @type {!string}
 * @export
 */
API.Client.TimePeriodDTO.prototype.comment;

