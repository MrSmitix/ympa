goog.provide('API.Client.GetQualityRatingRequest');

/**
 * Запрос информации по индексу качества.
 * @record
 */
API.Client.GetQualityRatingRequest = function() {}

/**
 * Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.GetQualityRatingRequest.prototype.dateFrom;

/**
 * Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.GetQualityRatingRequest.prototype.dateTo;

/**
 * Список идентификаторов магазинов.
 * @type {!set<!number>}
 * @export
 */
API.Client.GetQualityRatingRequest.prototype.campaignIds;

