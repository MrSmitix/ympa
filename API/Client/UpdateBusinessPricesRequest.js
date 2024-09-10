goog.provide('API.Client.UpdateBusinessPricesRequest');

/**
 * Запрос на установку базовых цен на товары.
 * @record
 */
API.Client.UpdateBusinessPricesRequest = function() {}

/**
 * Список товаров с ценами.
 * @type {!Array<!API.Client.UpdateBusinessOfferPriceDTO>}
 * @export
 */
API.Client.UpdateBusinessPricesRequest.prototype.offers;

