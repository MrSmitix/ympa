goog.provide('API.Client.UpdateOrderItemRequest');

/**
 * Запрос на обновление состава заказа.
 * @record
 */
API.Client.UpdateOrderItemRequest = function() {}

/**
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 * @type {!Array<!API.Client.OrderItemModificationDTO>}
 * @export
 */
API.Client.UpdateOrderItemRequest.prototype.items;

/**
 * @type {!API.Client.OrderItemsModificationRequestReasonType}
 * @export
 */
API.Client.UpdateOrderItemRequest.prototype.reason;

