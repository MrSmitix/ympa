goog.provide('API.Client.OffersDTO');

/**
 * Найденные предложения магазина.
 * @record
 */
API.Client.OffersDTO = function() {}

/**
 * Список предложений магазина.
 * @type {!Array<!API.Client.OfferDTO>}
 * @export
 */
API.Client.OffersDTO.prototype.offers;

