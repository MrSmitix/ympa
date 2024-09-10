goog.provide('API.Client.GeneratePricesReportRequest');

/**
 * Данные, необходимые для генерации отчета.
 * @record
 */
API.Client.GeneratePricesReportRequest = function() {}

/**
 * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
 * @type {!number}
 * @export
 */
API.Client.GeneratePricesReportRequest.prototype.businessId;

/**
 * Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
 * @type {!number}
 * @export
 */
API.Client.GeneratePricesReportRequest.prototype.campaignId;

/**
 * Фильтр по категориям на Маркете.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GeneratePricesReportRequest.prototype.categoryIds;

/**
 * Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.GeneratePricesReportRequest.prototype.creationDateFrom;

/**
 * Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.GeneratePricesReportRequest.prototype.creationDateTo;

