goog.provide('API.Client.FeedDownloadDTO');

/**
 * Информация о последней загрузке прайс-листа.
 * @record
 */
API.Client.FeedDownloadDTO = function() {}

/**
 * @type {!API.Client.FeedStatusType}
 * @export
 */
API.Client.FeedDownloadDTO.prototype.status;

/**
 * @type {!API.Client.FeedDownloadErrorDTO}
 * @export
 */
API.Client.FeedDownloadDTO.prototype.error;

