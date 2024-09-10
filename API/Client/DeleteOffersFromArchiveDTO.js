goog.provide('API.Client.DeleteOffersFromArchiveDTO');

/**
 * Товары, которые не удалось восстановить из архива.
 * @record
 */
API.Client.DeleteOffersFromArchiveDTO = function() {}

/**
 * Список товаров, которые не удалось восстановить из архива.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteOffersFromArchiveDTO.prototype.notUnarchivedOfferIds;

