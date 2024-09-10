goog.provide('API.Client.GetAllOffersResponse');

/**
 * Список предложений.
 * @record
 */
API.Client.GetAllOffersResponse = function() {}

/**
 * Список предложений магазина.
 * @type {!Array<!API.Client.OfferDTO>}
 * @export
 */
API.Client.GetAllOffersResponse.prototype.offers;

