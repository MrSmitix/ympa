goog.provide('API.Client.SuggestPricesRequest');

/**
 * Запрос на получение списка цен для продвижения.
 * @record
 */
API.Client.SuggestPricesRequest = function() {}

/**
 * Список товаров.
 * @type {!Array<!API.Client.SuggestOfferPriceDTO>}
 * @export
 */
API.Client.SuggestPricesRequest.prototype.offers;

