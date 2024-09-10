goog.provide('API.Client.GenerateShelfsStatisticsRequest');

/**
 * Данные, необходимые для генерации отчета. 
 * @record
 */
API.Client.GenerateShelfsStatisticsRequest = function() {}

/**
 * Идентификатор бизнеса.
 * @type {!number}
 * @export
 */
API.Client.GenerateShelfsStatisticsRequest.prototype.businessId;

/**
 * Начало периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateShelfsStatisticsRequest.prototype.dateFrom;

/**
 * Конец периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateShelfsStatisticsRequest.prototype.dateTo;

/**
 * @type {!API.Client.ShelfsStatisticsAttributionType}
 * @export
 */
API.Client.GenerateShelfsStatisticsRequest.prototype.attributionType;

