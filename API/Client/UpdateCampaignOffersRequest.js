goog.provide('API.Client.UpdateCampaignOffersRequest');

/**
 * Запрос на обновление предложений товаров магазина.
 * @record
 */
API.Client.UpdateCampaignOffersRequest = function() {}

/**
 * Параметры размещения товаров в заданном магазине.
 * @type {!Array<!API.Client.UpdateCampaignOfferDTO>}
 * @export
 */
API.Client.UpdateCampaignOffersRequest.prototype.offers;

