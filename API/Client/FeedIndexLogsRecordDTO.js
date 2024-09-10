goog.provide('API.Client.FeedIndexLogsRecordDTO');

/**
 * Список отчетов по индексации прайс-листа.
 * @record
 */
API.Client.FeedIndexLogsRecordDTO = function() {}

/**
 * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedIndexLogsRecordDTO.prototype.downloadTime;

/**
 * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedIndexLogsRecordDTO.prototype.fileTime;

/**
 * Идентификатор индексации.
 * @type {!number}
 * @export
 */
API.Client.FeedIndexLogsRecordDTO.prototype.generationId;

/**
 * @type {!API.Client.FeedIndexLogsIndexType}
 * @export
 */
API.Client.FeedIndexLogsRecordDTO.prototype.indexType;

/**
 * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedIndexLogsRecordDTO.prototype.publishedTime;

/**
 * @type {!API.Client.FeedIndexLogsStatusType}
 * @export
 */
API.Client.FeedIndexLogsRecordDTO.prototype.status;

/**
 * @type {!API.Client.FeedIndexLogsErrorDTO}
 * @export
 */
API.Client.FeedIndexLogsRecordDTO.prototype.error;

/**
 * @type {!API.Client.FeedIndexLogsOffersDTO}
 * @export
 */
API.Client.FeedIndexLogsRecordDTO.prototype.offers;

