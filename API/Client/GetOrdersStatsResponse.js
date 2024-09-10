goog.provide('API.Client.GetOrdersStatsResponse');

/**
 * Ответ на запрос информации по заказам.
 * @record
 */
API.Client.GetOrdersStatsResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetOrdersStatsResponse.prototype.status;

/**
 * @type {!API.Client.OrdersStatsDTO}
 * @export
 */
API.Client.GetOrdersStatsResponse.prototype.result;

