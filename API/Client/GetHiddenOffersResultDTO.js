goog.provide('API.Client.GetHiddenOffersResultDTO');

/**
 * Список скрытых вами товаров. 
 * @record
 */
API.Client.GetHiddenOffersResultDTO = function() {}

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.GetHiddenOffersResultDTO.prototype.paging;

/**
 * Список скрытых товаров.
 * @type {!Array<!API.Client.HiddenOfferDTO>}
 * @export
 */
API.Client.GetHiddenOffersResultDTO.prototype.hiddenOffers;

