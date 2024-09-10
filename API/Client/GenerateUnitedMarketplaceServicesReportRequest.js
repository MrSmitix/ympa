goog.provide('API.Client.GenerateUnitedMarketplaceServicesReportRequest');

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 * @record
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest = function() {}

/**
 * Идентификатор бизнеса.
 * @type {!number}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.businessId;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
 * @type {!Date}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.dateTimeFrom;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
 * @type {!Date}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.dateTimeTo;

/**
 * Начало периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.dateFrom;

/**
 * Конец периода, включительно. Максимальный период — 1 год.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.dateTo;

/**
 * Начальный год формирования акта.
 * @type {!number}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.yearFrom;

/**
 * Начальный номер месяца формирования акта.
 * @type {!number}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.monthFrom;

/**
 * Конечный год формирования акта.
 * @type {!number}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.yearTo;

/**
 * Конечный номер месяца формирования акта.
 * @type {!number}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.monthTo;

/**
 * Список моделей, которые нужны в отчете. 
 * @type {!Array<!API.Client.PlacementType>}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.placementPrograms;

/**
 * Список ИНН, которые нужны в отчете.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.inns;

/**
 * Список магазинов, которые нужны в отчете.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GenerateUnitedMarketplaceServicesReportRequest.prototype.campaignIds;

