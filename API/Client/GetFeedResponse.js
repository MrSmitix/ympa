goog.provide('API.Client.GetFeedResponse');

/**
 * Ответ на запрос информации о прайс-листе.
 * @record
 */
API.Client.GetFeedResponse = function() {}

/**
 * @type {!API.Client.FeedDTO}
 * @export
 */
API.Client.GetFeedResponse.prototype.feed;

