goog.provide('API.Client.OrdersStatsDTO');

/**
 * Информация по заказам.
 * @record
 */
API.Client.OrdersStatsDTO = function() {}

/**
 * Список заказов.
 * @type {!Array<!API.Client.OrdersStatsOrderDTO>}
 * @export
 */
API.Client.OrdersStatsDTO.prototype.orders;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.OrdersStatsDTO.prototype.paging;

