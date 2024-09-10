goog.provide('API.Client.DeleteOffersDTO');

/**
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 * @record
 */
API.Client.DeleteOffersDTO = function() {}

/**
 * Список SKU товаров, которые не удалось удалить.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteOffersDTO.prototype.notDeletedOfferIds;

