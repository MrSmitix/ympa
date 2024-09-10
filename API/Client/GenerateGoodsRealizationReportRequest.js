goog.provide('API.Client.GenerateGoodsRealizationReportRequest');

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 * @record
 */
API.Client.GenerateGoodsRealizationReportRequest = function() {}

/**
 * Идентификатор кампании.
 * @type {!number}
 * @export
 */
API.Client.GenerateGoodsRealizationReportRequest.prototype.campaignId;

/**
 * Год.
 * @type {!number}
 * @export
 */
API.Client.GenerateGoodsRealizationReportRequest.prototype.year;

/**
 * Номер месяца.
 * @type {!number}
 * @export
 */
API.Client.GenerateGoodsRealizationReportRequest.prototype.month;

