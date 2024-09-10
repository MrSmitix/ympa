goog.provide('API.Client.OrdersStatsPaymentDTO');

/**
 * Информация о денежных переводах по заказу.
 * @record
 */
API.Client.OrdersStatsPaymentDTO = function() {}

/**
 * Идентификатор денежного перевода.
 * @type {!string}
 * @export
 */
API.Client.OrdersStatsPaymentDTO.prototype.id;

/**
 * Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.OrdersStatsPaymentDTO.prototype.date;

/**
 * @type {!API.Client.OrdersStatsPaymentType}
 * @export
 */
API.Client.OrdersStatsPaymentDTO.prototype.type;

/**
 * @type {!API.Client.OrdersStatsPaymentSourceType}
 * @export
 */
API.Client.OrdersStatsPaymentDTO.prototype.source;

/**
 * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsPaymentDTO.prototype.total;

/**
 * @type {!API.Client.OrdersStatsPaymentOrderDTO}
 * @export
 */
API.Client.OrdersStatsPaymentDTO.prototype.paymentOrder;

