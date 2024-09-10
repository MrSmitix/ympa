goog.provide('API.Client.UpdateStocksRequest');

/**
 * Запрос на изменение информации по остаткам товаров.
 * @record
 */
API.Client.UpdateStocksRequest = function() {}

/**
 * Данные об остатках товаров. 
 * @type {!set<!API.Client.UpdateStockDTO>}
 * @export
 */
API.Client.UpdateStocksRequest.prototype.skus;

