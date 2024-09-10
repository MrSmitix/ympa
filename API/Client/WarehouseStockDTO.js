goog.provide('API.Client.WarehouseStockDTO');

/**
 * Информация об остатках товара.
 * @record
 */
API.Client.WarehouseStockDTO = function() {}

/**
 * @type {!API.Client.WarehouseStockType}
 * @export
 */
API.Client.WarehouseStockDTO.prototype.type;

/**
 * Значение остатков.
 * @type {!number}
 * @export
 */
API.Client.WarehouseStockDTO.prototype.count;

