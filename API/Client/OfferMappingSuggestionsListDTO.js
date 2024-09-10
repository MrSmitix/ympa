goog.provide('API.Client.OfferMappingSuggestionsListDTO');

/**
 * Список рекомендованных карточек товара.
 * @record
 */
API.Client.OfferMappingSuggestionsListDTO = function() {}

/**
 * Список товаров.
 * @type {!Array<!API.Client.EnrichedMappingsOfferDTO>}
 * @export
 */
API.Client.OfferMappingSuggestionsListDTO.prototype.offers;

