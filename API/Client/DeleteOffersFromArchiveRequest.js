goog.provide('API.Client.DeleteOffersFromArchiveRequest');

/**
 * Товары, которые нужно восстановить из архива. 
 * @record
 */
API.Client.DeleteOffersFromArchiveRequest = function() {}

/**
 * Список товаров, которые нужно восстановить из архива.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteOffersFromArchiveRequest.prototype.offerIds;

