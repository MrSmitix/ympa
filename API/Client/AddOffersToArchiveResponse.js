goog.provide('API.Client.AddOffersToArchiveResponse');

/**
 * Результат архивации товаров.
 * @record
 */
API.Client.AddOffersToArchiveResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.AddOffersToArchiveResponse.prototype.status;

/**
 * @type {!API.Client.AddOffersToArchiveDTO}
 * @export
 */
API.Client.AddOffersToArchiveResponse.prototype.result;

