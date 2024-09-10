goog.provide('API.Client.GoodsStatsWarehouseDTO');

/**
 * Информация о складе.
 * @record
 */
API.Client.GoodsStatsWarehouseDTO = function() {}

/**
 * Идентификатор склада.
 * @type {!number}
 * @export
 */
API.Client.GoodsStatsWarehouseDTO.prototype.id;

/**
 * Название склада.
 * @type {!string}
 * @export
 */
API.Client.GoodsStatsWarehouseDTO.prototype.name;

/**
 * Информация об остатках товаров на складе.
 * @type {!Array<!API.Client.WarehouseStockDTO>}
 * @export
 */
API.Client.GoodsStatsWarehouseDTO.prototype.stocks;

