goog.provide('API.Client.GenerateBoostConsolidatedRequest');

/**
 * Данные, необходимые для генерации отчета. 
 * @record
 */
API.Client.GenerateBoostConsolidatedRequest = function() {}

/**
 * Идентификатор бизнеса.
 * @type {!number}
 * @export
 */
API.Client.GenerateBoostConsolidatedRequest.prototype.businessId;

/**
 * Начало периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateBoostConsolidatedRequest.prototype.dateFrom;

/**
 * Конец периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateBoostConsolidatedRequest.prototype.dateTo;

