goog.provide('API.Client.OrdersStatsPaymentOrderDTO');

/**
 * Информация о платежном получении.
 * @record
 */
API.Client.OrdersStatsPaymentOrderDTO = function() {}

/**
 * Номер платежного поручения.
 * @type {!string}
 * @export
 */
API.Client.OrdersStatsPaymentOrderDTO.prototype.id;

/**
 * Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.OrdersStatsPaymentOrderDTO.prototype.date;

