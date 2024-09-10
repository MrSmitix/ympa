goog.provide('API.Client.AddOffersToArchiveDTO');

/**
 * Товары, которые не удалось поместить в архив.
 * @record
 */
API.Client.AddOffersToArchiveDTO = function() {}

/**
 * Список товаров, которые не удалось поместить в архив.
 * @type {!Array<!API.Client.AddOffersToArchiveErrorDTO>}
 * @export
 */
API.Client.AddOffersToArchiveDTO.prototype.notArchivedOffers;

