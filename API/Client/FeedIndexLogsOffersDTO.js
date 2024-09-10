goog.provide('API.Client.FeedIndexLogsOffersDTO');

/**
 * Информация о предложениях прайс-листа.
 * @record
 */
API.Client.FeedIndexLogsOffersDTO = function() {}

/**
 * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
 * @type {!number}
 * @export
 */
API.Client.FeedIndexLogsOffersDTO.prototype.rejectedCount;

/**
 * Количество предложений в прайс-листе.
 * @type {!number}
 * @export
 */
API.Client.FeedIndexLogsOffersDTO.prototype.totalCount;

