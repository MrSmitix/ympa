goog.provide('API.Client.GenerateReportResponse');

/**
 * Ответ на запрос генерации отчета.
 * @record
 */
API.Client.GenerateReportResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GenerateReportResponse.prototype.status;

/**
 * @type {!API.Client.GenerateReportDTO}
 * @export
 */
API.Client.GenerateReportResponse.prototype.result;

