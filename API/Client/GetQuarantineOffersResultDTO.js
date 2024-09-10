goog.provide('API.Client.GetQuarantineOffersResultDTO');

/**
 * Список товаров в карантине.
 * @record
 */
API.Client.GetQuarantineOffersResultDTO = function() {}

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.GetQuarantineOffersResultDTO.prototype.paging;

/**
 * Страница списка товаров в карантине.
 * @type {!Array<!API.Client.QuarantineOfferDTO>}
 * @export
 */
API.Client.GetQuarantineOffersResultDTO.prototype.offers;

