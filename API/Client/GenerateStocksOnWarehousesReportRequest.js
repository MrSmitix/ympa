goog.provide('API.Client.GenerateStocksOnWarehousesReportRequest');

/**
 * Данные, необходимые для генерации отчета. 
 * @record
 */
API.Client.GenerateStocksOnWarehousesReportRequest = function() {}

/**
 * Идентификатор магазина.
 * @type {!number}
 * @export
 */
API.Client.GenerateStocksOnWarehousesReportRequest.prototype.campaignId;

/**
 * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
 * @type {!Array<!number>}
 * @export
 */
API.Client.GenerateStocksOnWarehousesReportRequest.prototype.warehouseIds;

/**
 * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateStocksOnWarehousesReportRequest.prototype.reportDate;

/**
 * Фильтр по категориям на Маркете (кроме модели FBY).
 * @type {!Array<!number>}
 * @export
 */
API.Client.GenerateStocksOnWarehousesReportRequest.prototype.categoryIds;

/**
 * Фильтр по наличию остатков (кроме модели FBY).
 * @type {!boolean}
 * @export
 */
API.Client.GenerateStocksOnWarehousesReportRequest.prototype.hasStocks;

