goog.provide('API.Client.SuggestPricesResultDTO');

/**
 * Результат запроса цен для продвижения.
 * @record
 */
API.Client.SuggestPricesResultDTO = function() {}

/**
 * Список товаров с ценами для продвижения.
 * @type {!Array<!API.Client.PriceSuggestOfferDTO>}
 * @export
 */
API.Client.SuggestPricesResultDTO.prototype.offers;

