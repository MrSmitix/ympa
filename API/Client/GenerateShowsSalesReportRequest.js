goog.provide('API.Client.GenerateShowsSalesReportRequest');

/**
 * Данные, необходимые для генерации отчета.
 * @record
 */
API.Client.GenerateShowsSalesReportRequest = function() {}

/**
 * Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
 * @type {!number}
 * @export
 */
API.Client.GenerateShowsSalesReportRequest.prototype.businessId;

/**
 * Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
 * @type {!number}
 * @export
 */
API.Client.GenerateShowsSalesReportRequest.prototype.campaignId;

/**
 * Начало периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateShowsSalesReportRequest.prototype.dateFrom;

/**
 * Конец периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateShowsSalesReportRequest.prototype.dateTo;

/**
 * @type {!API.Client.ShowsSalesGroupingType}
 * @export
 */
API.Client.GenerateShowsSalesReportRequest.prototype.grouping;

