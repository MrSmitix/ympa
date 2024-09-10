goog.provide('API.Client.GenerateCompetitorsPositionReportRequest');

/**
 * Данные, необходимые для генерации отчета.
 * @record
 */
API.Client.GenerateCompetitorsPositionReportRequest = function() {}

/**
 * Идентификатор бизнеса.
 * @type {!number}
 * @export
 */
API.Client.GenerateCompetitorsPositionReportRequest.prototype.businessId;

/**
 * Идентификатор категории.
 * @type {!number}
 * @export
 */
API.Client.GenerateCompetitorsPositionReportRequest.prototype.categoryId;

/**
 * Начало периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateCompetitorsPositionReportRequest.prototype.dateFrom;

/**
 * Конец периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateCompetitorsPositionReportRequest.prototype.dateTo;

