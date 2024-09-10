goog.provide('API.Client.GetSuggestedOfferMappingEntriesResponse');

/**
 * Ответ со списком рекомендованных карточек товара.
 * @record
 */
API.Client.GetSuggestedOfferMappingEntriesResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetSuggestedOfferMappingEntriesResponse.prototype.status;

/**
 * @type {!API.Client.OfferMappingSuggestionsListDTO}
 * @export
 */
API.Client.GetSuggestedOfferMappingEntriesResponse.prototype.result;

