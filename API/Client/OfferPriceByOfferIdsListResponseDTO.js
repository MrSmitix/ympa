goog.provide('API.Client.OfferPriceByOfferIdsListResponseDTO');

/**
 * Список цен.
 * @record
 */
API.Client.OfferPriceByOfferIdsListResponseDTO = function() {}

/**
 * Страница списка цен.
 * @type {!Array<!API.Client.OfferPriceByOfferIdsResponseDTO>}
 * @export
 */
API.Client.OfferPriceByOfferIdsListResponseDTO.prototype.offers;

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.OfferPriceByOfferIdsListResponseDTO.prototype.paging;

