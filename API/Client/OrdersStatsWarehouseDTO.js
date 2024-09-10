goog.provide('API.Client.OrdersStatsWarehouseDTO');

/**
 * Информация о складе, на котором хранится товар.
 * @record
 */
API.Client.OrdersStatsWarehouseDTO = function() {}

/**
 * Идентификатор склада.
 * @type {!number}
 * @export
 */
API.Client.OrdersStatsWarehouseDTO.prototype.id;

/**
 * Название склада.
 * @type {!string}
 * @export
 */
API.Client.OrdersStatsWarehouseDTO.prototype.name;

