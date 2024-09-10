goog.provide('API.Client.GetSuggestedOfferMappingEntriesRequest');

/**
 * Запрос рекомендованных карточек товара.
 * @record
 */
API.Client.GetSuggestedOfferMappingEntriesRequest = function() {}

/**
 * Список товаров.
 * @type {!Array<!API.Client.MappingsOfferDTO>}
 * @export
 */
API.Client.GetSuggestedOfferMappingEntriesRequest.prototype.offers;

