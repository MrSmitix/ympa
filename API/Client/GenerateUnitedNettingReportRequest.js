goog.provide('API.Client.GenerateUnitedNettingReportRequest');

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 * @record
 */
API.Client.GenerateUnitedNettingReportRequest = function() {}

/**
 * Идентификатор бизнеса.
 * @type {!number}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.businessId;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
 * @type {!Date}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.dateTimeFrom;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
 * @type {!Date}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.dateTimeTo;

/**
 * Начало периода, включительно.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.dateFrom;

/**
 * Конец периода, включительно. Максимальный период — 1 год.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.dateTo;

/**
 * Номер платежного поручения.
 * @type {!number}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.bankOrderId;

/**
 * Дата платежного поручения.
 * @type {!Date}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.bankOrderDateTime;

/**
 * Список моделей, которые нужны в отчете. 
 * @type {!Array<!API.Client.PlacementType>}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.placementPrograms;

/**
 * Список ИНН, которые нужны в отчете.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.inns;

/**
 * Список магазинов, которые нужны в отчете.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GenerateUnitedNettingReportRequest.prototype.campaignIds;

