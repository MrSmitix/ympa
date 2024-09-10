goog.provide('API.Client.GenerateUnitedOrdersRequest');

/**
 * Данные, необходимые для генерации отчета. 
 * @record
 */
API.Client.GenerateUnitedOrdersRequest = function() {}

/**
 * Идентификатор бизнеса.
 * @type {!number}
 * @export
 */
API.Client.GenerateUnitedOrdersRequest.prototype.businessId;

/**
 * Начало периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateUnitedOrdersRequest.prototype.dateFrom;

/**
 * Конец периода, включительно. Максимальный период — 1 год.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateUnitedOrdersRequest.prototype.dateTo;

/**
 * Список магазинов, которые нужны в отчете.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GenerateUnitedOrdersRequest.prototype.campaignIds;

/**
 * Идентификатор акции, товары из которой нужны в отчете.
 * @type {!string}
 * @export
 */
API.Client.GenerateUnitedOrdersRequest.prototype.promoId;

