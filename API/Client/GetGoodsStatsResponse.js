goog.provide('API.Client.GetGoodsStatsResponse');

/**
 * Ответ на запрос отчета по товарам.
 * @record
 */
API.Client.GetGoodsStatsResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetGoodsStatsResponse.prototype.status;

/**
 * @type {!API.Client.GoodsStatsDTO}
 * @export
 */
API.Client.GetGoodsStatsResponse.prototype.result;

