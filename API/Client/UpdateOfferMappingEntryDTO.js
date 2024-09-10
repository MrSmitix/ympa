goog.provide('API.Client.UpdateOfferMappingEntryDTO');

/**
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 * @record
 */
API.Client.UpdateOfferMappingEntryDTO = function() {}

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.UpdateOfferMappingEntryDTO.prototype.mapping;

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.UpdateOfferMappingEntryDTO.prototype.awaitingModerationMapping;

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.UpdateOfferMappingEntryDTO.prototype.rejectedMapping;

/**
 * @type {!API.Client.UpdateMappingsOfferDTO}
 * @export
 */
API.Client.UpdateOfferMappingEntryDTO.prototype.offer;

