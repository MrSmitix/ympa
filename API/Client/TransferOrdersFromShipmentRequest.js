goog.provide('API.Client.TransferOrdersFromShipmentRequest');

/**
 * Запрос переноса заказов из отгрузки.
 * @record
 */
API.Client.TransferOrdersFromShipmentRequest = function() {}

/**
 * Список заказов, которые вы не успеваете подготовить.
 * @type {!Array<!number>}
 * @export
 */
API.Client.TransferOrdersFromShipmentRequest.prototype.orderIds;

