goog.provide('API.Client.UpdateOfferMappingEntryRequest');

/**
 * Запрос на обновление товаров.
 * @record
 */
API.Client.UpdateOfferMappingEntryRequest = function() {}

/**
 * Информация о товарах в каталоге.
 * @type {!Array<!API.Client.UpdateOfferMappingEntryDTO>}
 * @export
 */
API.Client.UpdateOfferMappingEntryRequest.prototype.offerMappingEntries;

