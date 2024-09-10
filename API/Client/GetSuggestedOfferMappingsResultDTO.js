goog.provide('API.Client.GetSuggestedOfferMappingsResultDTO');

/**
 * Подобранные карточки на Маркете.
 * @record
 */
API.Client.GetSuggestedOfferMappingsResultDTO = function() {}

/**
 * Список товаров.
 * @type {!Array<!API.Client.SuggestedOfferMappingDTO>}
 * @export
 */
API.Client.GetSuggestedOfferMappingsResultDTO.prototype.offers;

