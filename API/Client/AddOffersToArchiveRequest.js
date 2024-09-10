goog.provide('API.Client.AddOffersToArchiveRequest');

/**
 * Товары, которые нужно поместить в архив. 
 * @record
 */
API.Client.AddOffersToArchiveRequest = function() {}

/**
 * Список товаров, которые нужно поместить в архив.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AddOffersToArchiveRequest.prototype.offerIds;

