goog.provide('API.Client.FeedIndexLogsResultDTO');

/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 * @record
 */
API.Client.FeedIndexLogsResultDTO = function() {}

/**
 * @type {!API.Client.FeedIndexLogsFeedDTO}
 * @export
 */
API.Client.FeedIndexLogsResultDTO.prototype.feed;

/**
 * Список отчетов по индексации прайс-листа.
 * @type {!Array<!API.Client.FeedIndexLogsRecordDTO>}
 * @export
 */
API.Client.FeedIndexLogsResultDTO.prototype.indexLogRecords;

/**
 * Количество отчетов на всех страницах выходных данных.
 * @type {!number}
 * @export
 */
API.Client.FeedIndexLogsResultDTO.prototype.total;

