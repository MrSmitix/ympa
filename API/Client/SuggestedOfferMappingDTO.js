goog.provide('API.Client.SuggestedOfferMappingDTO');

/**
 * Товар с соответствующей карточкой на Маркете.
 * @record
 */
API.Client.SuggestedOfferMappingDTO = function() {}

/**
 * @type {!API.Client.SuggestedOfferDTO}
 * @export
 */
API.Client.SuggestedOfferMappingDTO.prototype.offer;

/**
 * @type {!API.Client.GetMappingDTO}
 * @export
 */
API.Client.SuggestedOfferMappingDTO.prototype.mapping;

