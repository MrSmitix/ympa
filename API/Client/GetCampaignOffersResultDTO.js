goog.provide('API.Client.GetCampaignOffersResultDTO');

/**
 * Список товаров в заданном магазине.
 * @record
 */
API.Client.GetCampaignOffersResultDTO = function() {}

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.GetCampaignOffersResultDTO.prototype.paging;

/**
 * Страница списка товаров.
 * @type {!Array<!API.Client.GetCampaignOfferDTO>}
 * @export
 */
API.Client.GetCampaignOffersResultDTO.prototype.offers;

