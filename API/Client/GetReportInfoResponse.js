goog.provide('API.Client.GetReportInfoResponse');

/**
 * Ответ на запрос информации об отчете.
 * @record
 */
API.Client.GetReportInfoResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetReportInfoResponse.prototype.status;

/**
 * @type {!API.Client.ReportInfoDTO}
 * @export
 */
API.Client.GetReportInfoResponse.prototype.result;

