goog.provide('API.Client.GetBidsInfoResponseDTO');

/**
 * Список товаров с указанными ставками.
 * @record
 */
API.Client.GetBidsInfoResponseDTO = function() {}

/**
 * Страница списка товаров.
 * @type {!Array<!API.Client.SkuBidItemDTO>}
 * @export
 */
API.Client.GetBidsInfoResponseDTO.prototype.bids;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.GetBidsInfoResponseDTO.prototype.paging;

