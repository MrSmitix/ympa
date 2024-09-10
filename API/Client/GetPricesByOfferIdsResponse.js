goog.provide('API.Client.GetPricesByOfferIdsResponse');

/**
 * Ответ на запрос списка цен.
 * @record
 */
API.Client.GetPricesByOfferIdsResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetPricesByOfferIdsResponse.prototype.status;

/**
 * @type {!API.Client.OfferPriceByOfferIdsListResponseDTO}
 * @export
 */
API.Client.GetPricesByOfferIdsResponse.prototype.result;

