goog.provide('API.Client.GetPricesResponse');

/**
 * Ответ на запрос списка цен.
 * @record
 */
API.Client.GetPricesResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetPricesResponse.prototype.status;

/**
 * @type {!API.Client.OfferPriceListResponseDTO}
 * @export
 */
API.Client.GetPricesResponse.prototype.result;

