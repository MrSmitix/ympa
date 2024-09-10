goog.provide('API.Client.GetWarehouseStocksDTO');

/**
 * Список складов с информацией об остатках на каждом из них.
 * @record
 */
API.Client.GetWarehouseStocksDTO = function() {}

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.GetWarehouseStocksDTO.prototype.paging;

/**
 * Страница списка складов.
 * @type {!Array<!API.Client.WarehouseOffersDTO>}
 * @export
 */
API.Client.GetWarehouseStocksDTO.prototype.warehouses;

