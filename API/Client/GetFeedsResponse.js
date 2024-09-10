goog.provide('API.Client.GetFeedsResponse');

/**
 * Ответ на запрос списка прайс-листов.
 * @record
 */
API.Client.GetFeedsResponse = function() {}

/**
 * Список прайс-листов.
 * @type {!Array<!API.Client.FeedDTO>}
 * @export
 */
API.Client.GetFeedsResponse.prototype.feeds;

