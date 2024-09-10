goog.provide('API.Client.OrdersStatsCommissionDTO');

/**
 * Информация о стоимости услуг.
 * @record
 */
API.Client.OrdersStatsCommissionDTO = function() {}

/**
 * @type {!API.Client.OrdersStatsCommissionType}
 * @export
 */
API.Client.OrdersStatsCommissionDTO.prototype.type;

/**
 * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsCommissionDTO.prototype.actual;

