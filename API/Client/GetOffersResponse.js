goog.provide('API.Client.GetOffersResponse');

/**
 * Список предложений с пагинатором.
 * @record
 */
API.Client.GetOffersResponse = function() {}

/**
 * Список предложений магазина.
 * @type {!Array<!API.Client.OfferDTO>}
 * @export
 */
API.Client.GetOffersResponse.prototype.offers;

/**
 * @type {!API.Client.FlippingPagerDTO}
 * @export
 */
API.Client.GetOffersResponse.prototype.pager;

