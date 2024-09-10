goog.provide('API.Client.OfferMappingEntriesDTO');

/**
 * Информация о товарах в каталоге.
 * @record
 */
API.Client.OfferMappingEntriesDTO = function() {}

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.OfferMappingEntriesDTO.prototype.paging;

/**
 * Информация о товарах в каталоге.
 * @type {!Array<!API.Client.OfferMappingEntryDTO>}
 * @export
 */
API.Client.OfferMappingEntriesDTO.prototype.offerMappingEntries;

