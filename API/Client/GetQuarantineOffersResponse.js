goog.provide('API.Client.GetQuarantineOffersResponse');

/**
 * Ответ на запрос списка товаров в карантине.
 * @record
 */
API.Client.GetQuarantineOffersResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetQuarantineOffersResponse.prototype.status;

/**
 * @type {!API.Client.GetQuarantineOffersResultDTO}
 * @export
 */
API.Client.GetQuarantineOffersResponse.prototype.result;

