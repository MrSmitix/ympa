goog.provide('API.Client.TurnoverDTO');

/**
 * Информация об оборачиваемости товара.
 * @record
 */
API.Client.TurnoverDTO = function() {}

/**
 * @type {!API.Client.TurnoverType}
 * @export
 */
API.Client.TurnoverDTO.prototype.turnover;

/**
 * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
 * @type {!number}
 * @export
 */
API.Client.TurnoverDTO.prototype.turnoverDays;

