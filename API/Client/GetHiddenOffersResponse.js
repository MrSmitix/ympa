goog.provide('API.Client.GetHiddenOffersResponse');

/**
 * Ответ на запрос списка скрытий.
 * @record
 */
API.Client.GetHiddenOffersResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetHiddenOffersResponse.prototype.status;

/**
 * @type {!API.Client.GetHiddenOffersResultDTO}
 * @export
 */
API.Client.GetHiddenOffersResponse.prototype.result;

