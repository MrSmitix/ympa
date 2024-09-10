goog.provide('API.Client.PromoPeriodDTO');

/**
 * Время проведения акции.
 * @record
 */
API.Client.PromoPeriodDTO = function() {}

/**
 * Дата и время начала акции.
 * @type {!Date}
 * @export
 */
API.Client.PromoPeriodDTO.prototype.dateTimeFrom;

/**
 * Дата и время окончания акции.
 * @type {!Date}
 * @export
 */
API.Client.PromoPeriodDTO.prototype.dateTimeTo;

