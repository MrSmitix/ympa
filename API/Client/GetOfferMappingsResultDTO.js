goog.provide('API.Client.GetOfferMappingsResultDTO');

/**
 * Информация о товарах.
 * @record
 */
API.Client.GetOfferMappingsResultDTO = function() {}

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.GetOfferMappingsResultDTO.prototype.paging;

/**
 * Информация о товарах.
 * @type {!Array<!API.Client.GetOfferMappingDTO>}
 * @export
 */
API.Client.GetOfferMappingsResultDTO.prototype.offerMappings;

