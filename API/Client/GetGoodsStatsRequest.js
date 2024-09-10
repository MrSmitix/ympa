goog.provide('API.Client.GetGoodsStatsRequest');

/**
 * Запрос отчета по товарам.
 * @record
 */
API.Client.GetGoodsStatsRequest = function() {}

/**
 * Список ваших идентификаторов SKU. 
 * @type {!set<!string>}
 * @export
 */
API.Client.GetGoodsStatsRequest.prototype.shopSkus;

