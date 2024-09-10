goog.provide('API.Client.DeleteOffersRequest');

/**
 * Фильтрации удаляемых товаров по offerIds. 
 * @record
 */
API.Client.DeleteOffersRequest = function() {}

/**
 * Список SKU товаров, которые нужно удалить.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteOffersRequest.prototype.offerIds;

