goog.provide('API.Client.UpdatePricesRequest');

/**
 * Запрос на установку цен на товары.
 * @record
 */
API.Client.UpdatePricesRequest = function() {}

/**
 * Список товаров.
 * @type {!Array<!API.Client.OfferPriceDTO>}
 * @export
 */
API.Client.UpdatePricesRequest.prototype.offers;

