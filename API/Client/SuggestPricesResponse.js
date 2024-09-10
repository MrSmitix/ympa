goog.provide('API.Client.SuggestPricesResponse');

/**
 * Ответ на запрос списка цен для продвижения.
 * @record
 */
API.Client.SuggestPricesResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.SuggestPricesResponse.prototype.status;

/**
 * @type {!API.Client.SuggestPricesResultDTO}
 * @export
 */
API.Client.SuggestPricesResponse.prototype.result;

