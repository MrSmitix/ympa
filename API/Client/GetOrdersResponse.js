goog.provide('API.Client.GetOrdersResponse');

/**
 * Модель для ответа API списка информации по заказам.
 * @record
 */
API.Client.GetOrdersResponse = function() {}

/**
 * @type {!API.Client.FlippingPagerDTO}
 * @export
 */
API.Client.GetOrdersResponse.prototype.pager;

/**
 * Модель заказа. 
 * @type {!Array<!API.Client.OrderDTO>}
 * @export
 */
API.Client.GetOrdersResponse.prototype.orders;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.GetOrdersResponse.prototype.paging;

