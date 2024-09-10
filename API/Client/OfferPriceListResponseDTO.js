goog.provide('API.Client.OfferPriceListResponseDTO');

/**
 * Список цен на товары.
 * @record
 */
API.Client.OfferPriceListResponseDTO = function() {}

/**
 * Страница списка.
 * @type {!Array<!API.Client.OfferPriceResponseDTO>}
 * @export
 */
API.Client.OfferPriceListResponseDTO.prototype.offers;

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.OfferPriceListResponseDTO.prototype.paging;

/**
 * Количество всех цен магазина, измененных через API.
 * @type {!number}
 * @export
 */
API.Client.OfferPriceListResponseDTO.prototype.total;

