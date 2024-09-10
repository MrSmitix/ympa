goog.provide('API.Client.GetOutletResponse');

/**
 * Ответ на запрос информации о точке продаж.
 * @record
 */
API.Client.GetOutletResponse = function() {}

/**
 * @type {!API.Client.FullOutletDTO}
 * @export
 */
API.Client.GetOutletResponse.prototype.outlet;

