goog.provide('API.Client.GetPromoOffersResultDTO');

/**
 * Список товаров, которые участвуют или могут участвовать в акции.
 * @record
 */
API.Client.GetPromoOffersResultDTO = function() {}

/**
 * Товары, которые участвуют или могут участвовать в акции.
 * @type {!Array<!API.Client.GetPromoOfferDTO>}
 * @export
 */
API.Client.GetPromoOffersResultDTO.prototype.offers;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.GetPromoOffersResultDTO.prototype.paging;

