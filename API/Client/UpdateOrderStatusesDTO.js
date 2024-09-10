goog.provide('API.Client.UpdateOrderStatusesDTO');

/**
 * Список заказов, статус которых обновился.
 * @record
 */
API.Client.UpdateOrderStatusesDTO = function() {}

/**
 * Список с обновленными заказами.
 * @type {!Array<!API.Client.UpdateOrderStatusDTO>}
 * @export
 */
API.Client.UpdateOrderStatusesDTO.prototype.orders;

