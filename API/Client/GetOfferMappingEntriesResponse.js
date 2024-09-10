goog.provide('API.Client.GetOfferMappingEntriesResponse');

/**
 * Ответ на запрос списка товаров в каталоге.
 * @record
 */
API.Client.GetOfferMappingEntriesResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetOfferMappingEntriesResponse.prototype.status;

/**
 * @type {!API.Client.OfferMappingEntriesDTO}
 * @export
 */
API.Client.GetOfferMappingEntriesResponse.prototype.result;

