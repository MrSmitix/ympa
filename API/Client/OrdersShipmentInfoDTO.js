goog.provide('API.Client.OrdersShipmentInfoDTO');

/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 * @record
 */
API.Client.OrdersShipmentInfoDTO = function() {}

/**
 * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
 * @type {!set<!number>}
 * @export
 */
API.Client.OrdersShipmentInfoDTO.prototype.orderIdsWithLabels;

/**
 * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
 * @type {!set<!number>}
 * @export
 */
API.Client.OrdersShipmentInfoDTO.prototype.orderIdsWithoutLabels;

