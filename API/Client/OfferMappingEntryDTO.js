goog.provide('API.Client.OfferMappingEntryDTO');

/**
 * Список товаров. 
 * @record
 */
API.Client.OfferMappingEntryDTO = function() {}

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.OfferMappingEntryDTO.prototype.mapping;

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.OfferMappingEntryDTO.prototype.awaitingModerationMapping;

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.OfferMappingEntryDTO.prototype.rejectedMapping;

/**
 * @type {!API.Client.MappingsOfferDTO}
 * @export
 */
API.Client.OfferMappingEntryDTO.prototype.offer;

