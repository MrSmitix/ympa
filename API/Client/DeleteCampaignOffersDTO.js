goog.provide('API.Client.DeleteCampaignOffersDTO');

/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 * @record
 */
API.Client.DeleteCampaignOffersDTO = function() {}

/**
 * Список SKU.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteCampaignOffersDTO.prototype.notDeletedOfferIds;

